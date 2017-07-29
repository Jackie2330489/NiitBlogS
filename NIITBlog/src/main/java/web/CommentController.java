package web;

import dto.NiitBlogResult;
import entity.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ArticleService;
import service.CommentService;
import util.XSSUtil;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommentService commentService;

    /**
     * 添加评论接口
     * @param fromWhoId
     * @param toWhoId
     * @param text
     * @return
     */
    @RequestMapping(value = "/addComment",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addComment(@RequestParam String fromWhoId,@RequestParam String toWhoId,@RequestParam String text){
        fromWhoId= XSSUtil.killXSS(fromWhoId);
        toWhoId= XSSUtil.killXSS(toWhoId);
        text= XSSUtil.killXSS(text);
        if(commentService.addComment(fromWhoId,toWhoId,text))return "yes";
        else return "no";
    }

    /**
     * 删除评论接口
     * @param commentId
     * @return
     */
    @RequestMapping(value = "/delComment",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String delComment(@RequestParam long commentId){
        if(commentService.delComment(commentId))return "yes";
        else return "no";
    }
}
