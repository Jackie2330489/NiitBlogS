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
import service.LikesTableService;
import util.XSSUtil;

import java.util.List;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/like")
public class LikesTableController {

    @Autowired
    private LikesTableService likesTableService;

    /**
     * 点赞接口
     * @param fromWhoId
     * @param toWhoId
     * @param msg
     * @return
     */
    @RequestMapping(value = "/addLike",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addLeaveMsg(@RequestParam String studentId,@RequestParam long articleId){
        studentId= XSSUtil.killXSS(studentId);//防预XSS,Sql注入
        if(likesTableService.addLike(studentId,articleId))return "yes";
        return "no";
    }

    /**
     * 删除留言接口
     * @param lmsgId
     * @return
     */
    @RequestMapping(value = "/delLike",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String delLike(@RequestParam String studentId,@RequestParam long articleId){
        if(likesTableService.delLike(studentId,articleId))return "yes";
        return "no";
    }
}
