package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Justin on 2017/7/25.
 */
@Controller
public class CommonController {
    //跳转各页面
    @RequestMapping(value = "/rindex",method = RequestMethod.GET)
    public String goRindex(){
        return "unloginIndex";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String goIndex(){
        return "loginIndex";
    }

    @RequestMapping(value = "/myinfo",method = RequestMethod.GET)
    public String goMyinfo(){
        return "myinfo";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String goRegister(){
        return "register";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String goLogin(){
        return "login";
    }
}
