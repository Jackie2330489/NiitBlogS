package web;

import dto.NiitBlogResult;
import entity.UnReadNoti;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.NotificationService;
import util.XSSUtil;

/**
 * Created by Justin on 2017/7/28.
 */
@Controller
@RequestMapping("/noti")
public class NotificationController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NotificationService notificationService;

    /**
     * 获取未读消息接口
     * @param studentId
     * @return
     */
    @RequestMapping(value = "/getUnRead",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<UnReadNoti> getUnRead(@RequestParam String studentId){
        NiitBlogResult<UnReadNoti> result=null;
        studentId= XSSUtil.killXSS(studentId);
        UnReadNoti unReadNoti=notificationService.getUnReadNoti(studentId);
        if(unReadNoti!=null)result=new NiitBlogResult<UnReadNoti>(true,unReadNoti);
        else result=new NiitBlogResult<UnReadNoti>(false,"获取未读消息失败");
        return result;
    }

    /**
     * 添加消息接口
     * @param fromWhoId
     * @param toWhoId
     * @param text
     * @param status
     * @return
     */
    @RequestMapping(value = "/addNoti",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addNoti(@RequestParam String fromWhoId,@RequestParam String toWhoId,@RequestParam String text,@RequestParam int status){
        fromWhoId= XSSUtil.killXSS(fromWhoId);
        toWhoId= XSSUtil.killXSS(toWhoId);
        text= XSSUtil.killXSS(text);
        if(notificationService.addNoti(fromWhoId,toWhoId,text,status))return "yes";
        return "no";
    }

    /**
     * 设消息为已读接口
     * @param notiId
     * @return
     */
    @RequestMapping(value = "/readNoti",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String readNoti(@RequestParam long notiId){
        if(notificationService.readNoti(notiId))return "yes";
        return "no";
    }

    /**
     * 删除消息接口
     * @param notiId
     * @return
     */
    @RequestMapping(value = "/delNoti",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String delNoti(@RequestParam long notiId){
        if(notificationService.delNoti(notiId))return "yes";
        return "no";
    }
}
