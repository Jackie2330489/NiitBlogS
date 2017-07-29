package web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpResponse;
import dto.NiitBlogResult;
import entity.Student;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;
import util.XSSUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import static util.XSSUtil.killXSS;

/**
 * Created by Justin on 2017/7/27.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    /**
     * 获取用户信息
     * @param studentId
     * @return
     */
    @RequestMapping(value = "/getStudent",method = RequestMethod.POST,
    produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<Student> getStudent(@RequestParam String studentId){
        NiitBlogResult<Student> result=null;
        studentId=XSSUtil.killXSS(studentId);
        Student student=studentService.getStudent(studentId);
        if(student!=null)result=new NiitBlogResult<Student>(true,student);
        else result=new NiitBlogResult<Student>(false,"找不到用户信息");
        return result;
    }

    /**
     * 删除Cookie
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/delCookie",method = RequestMethod.POST)
    @ResponseBody
    public String delCookie(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies=request.getCookies();//获取Cookie
        if(cookies!=null){//检查非空
            for(Cookie cookie:cookies){
                if (cookie.getName().equals("USID")||cookie.getName().equals("NIITID")){//查找USID NIITID
                    cookie.setValue(null);
                    cookie.setMaxAge(0);//删除Cookie
                    cookie.setPath("/");
                    response.addCookie(cookie);
                }
            }
            return "yes";
        }
        return "no";
    }

    /**
     * 检查Cookie 前端每5秒请求一次
     * @param request
     * @return
     */
    @RequestMapping(value = "/checkCookie", method = RequestMethod.POST)
    @ResponseBody
    public String checkCookie(HttpServletRequest request) {
        String usid = "";
        String niitid = "";
        String ip = request.getRemoteAddr();
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
            return "no";
        }else{
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("USID")) {
                    usid = cookie.getValue();
                }
                if (cookie.getName().equals("NIITID")) {
                    niitid = cookie.getValue();
                }
            }
            if (usid==null||niitid==null){
                return "no";
            }
            //获取USID NIITID
            usid= killXSS(usid);
            if(studentService.checkCookieValue(usid,niitid,ip)){
                return "yes";
            }//service层检查Login接口
        }
        return "no";
    }

    /**
     * 未使用
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/checkLoginInfo", method = RequestMethod.POST)
    @ResponseBody
    public String checkLoginInfo(HttpServletRequest request,HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        int count = 0;
        if (cookies == null) {
            return "no";
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("USID")) {
                    count++;
                }
                if (cookie.getName().equals("NIITID")) {
                    count++;
                }
            }
            if (count == 2) return "yes";
        }
        return "no";
    }

    /**
     * 注册时ajax检查id是否已被注册
     * @param inputRegisterId
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/checkID", method = RequestMethod.POST)
    @ResponseBody
    public String checkID(@RequestParam String inputRegisterId) throws JsonProcessingException {
        Map<String, Boolean> map = new HashMap();
        ObjectMapper mapper = new ObjectMapper();
        String registerId = killXSS(inputRegisterId);
        if (!registerId.equals(inputRegisterId)) {
            map.put("valid", false);
            return mapper.writeValueAsString(map);
        }
        map.put("valid", studentService.checkIdIsOnly(registerId));
        return mapper.writeValueAsString(map);
    }

    /**
     * 登录接口
     * @param request
     * @param response
     * @param inputLoginId
     * @param inputLoginPassword
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, @RequestParam String inputLoginId, @RequestParam String inputLoginPassword) {
        String studentId = killXSS(inputLoginId);
        String shadow = killXSS(inputLoginPassword);
        String ip = request.getRemoteAddr();
        if (!studentId.equals(inputLoginId) || !shadow.equals(inputLoginPassword)) {
            logger.error(ip + "attack:inputId-" + inputLoginId + ",inputPassword-" + inputLoginPassword);
            //检错日志
            return "login";
        }
        String retn = studentService.login(studentId, shadow, ip);
        if (retn.equals("no")) {
            logger.error(ip + "loginFailed:inputId-" + inputLoginId + ",inputPassword-" + inputLoginPassword);
            return "login";
        }
        //验证成功 设置Cookie
        Cookie cookie1 = new Cookie("USID", studentId);
        cookie1.setMaxAge(24 * 60 * 60);
        cookie1.setHttpOnly(true);
        cookie1.setPath("/");
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("NIITID", retn);
        cookie2.setMaxAge(24 * 60 * 60);
        cookie2.setHttpOnly(true);
        cookie2.setPath("/");
        response.addCookie(cookie2);
        return "loginIndex";
    }

    /**
     * 注册接口
     * @param request
     * @param response
     * @param inputRegisterId
     * @param inputRegisterName
     * @param inputRegisterGrade
     * @param inputRegisterSpec
     * @param inputRegisterClass
     * @param inputRegisterPassword1
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request, HttpServletResponse response,
                           @RequestParam String inputRegisterId, @RequestParam String inputRegisterName,
                           @RequestParam int inputRegisterGrade, @RequestParam String inputRegisterSpec,
                           @RequestParam int inputRegisterClass, @RequestParam String inputRegisterPassword1) {
        String registerId = killXSS(inputRegisterId);
//        String registerName=XSSUtil.killXSS(inputRegisterName);
        String registerSpec = killXSS(inputRegisterSpec);
        String registerPassword = killXSS(inputRegisterPassword1);
        String ip = request.getRemoteAddr();
        if (!registerId.equals(inputRegisterId) || !registerSpec.equals(inputRegisterSpec) || !registerPassword.equals(inputRegisterPassword1)) {
            logger.error(ip + "attack");
            return "register";
        }
        String retn = studentService.register(registerId, inputRegisterName, inputRegisterGrade, registerSpec, inputRegisterClass, registerPassword, ip);
        if (retn.equals("no")) {
            logger.error("no side comes wrongs");
            return "login";
        }
        Cookie cookie1 = new Cookie("USID", registerId);
        cookie1.setMaxAge(24 * 60 * 60);
        cookie1.setHttpOnly(true);
        cookie1.setPath("/");
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("NIITID", retn);
        cookie2.setMaxAge(24 * 60 * 60);
        cookie2.setHttpOnly(true);
        cookie2.setPath("/");
        response.addCookie(cookie2);
        return "loginIndex";
    }
}
