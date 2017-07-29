package web;

import dto.NiitBlogResult;
import entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.LeaveMsgService;
import util.XSSUtil;

import java.util.List;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/leaveMsg")
public class LeaveMsgController {

    @Autowired
    private LeaveMsgService leaveMsgService;

    /**
     * 添加留言接口
     * @param fromWhoId
     * @param toWhoId
     * @param msg
     * @return
     */
    @RequestMapping(value = "/addLeaveMsg",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addLeaveMsg(@RequestParam String fromWhoId,@RequestParam String toWhoId,@RequestParam String msg){
        fromWhoId= XSSUtil.killXSS(fromWhoId);//防预XSS,Sql注入
        toWhoId= XSSUtil.killXSS(toWhoId);//防预XSS,Sql注入
        msg= XSSUtil.killXSS(msg);//防预XSS,Sql注入
        if(leaveMsgService.addLeaveMsg(fromWhoId,toWhoId,msg))return "yes";
        return "no";
    }

    /**
     * 删除留言接口
     * @param lmsgId
     * @return
     */
    @RequestMapping(value = "/delLeaveMsg",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String delLeaveMsg(@RequestParam long lmsgId){
        if(leaveMsgService.delLeaveMsg(lmsgId))return "yes";
        return "no";
    }
}
