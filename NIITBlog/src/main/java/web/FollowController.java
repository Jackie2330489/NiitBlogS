package web;

import dto.NiitBlogResult;
import entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.FollowService;
import util.XSSUtil;

import java.util.List;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/follow")
public class FollowController {

    @Autowired
    private FollowService followService;

    @RequestMapping(value = "/addFollow",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addFollow(@RequestParam String fromWhoId,@RequestParam String toWhoId){
        fromWhoId= XSSUtil.killXSS(fromWhoId);//防预XSS,Sql注入
        toWhoId= XSSUtil.killXSS(toWhoId);//防预XSS,Sql注入
        if(followService.addFollow(fromWhoId,toWhoId))return "yes";
        else return "no";
    }

    @RequestMapping(value = "/delFollow",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String delFollow(@RequestParam String fromWhoId,@RequestParam String toWhoId){
        fromWhoId= XSSUtil.killXSS(fromWhoId);//防预XSS,Sql注入
        toWhoId= XSSUtil.killXSS(toWhoId);//防预XSS,Sql注入
        if(followService.delFollow(fromWhoId,toWhoId))return "yes";
        else return "no";
    }

}
