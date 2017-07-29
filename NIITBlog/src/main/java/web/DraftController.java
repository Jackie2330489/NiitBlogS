package web;

import dto.NiitBlogResult;
import entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DraftService;
import util.XSSUtil;

import java.util.List;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/draft")
public class DraftController {

    @Autowired
    private DraftService draftService;

    /**
     * 添加草稿接口
     * @param studentId
     * @param title
     * @param body
     * @return
     */
    @RequestMapping(value = "/addDraft",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addDraft(@RequestParam String studentId,@RequestParam String title,@RequestParam String body){
        studentId= XSSUtil.killXSS(studentId);//防预XSS,Sql注入
        title= XSSUtil.killXSS(title);//防预XSS,Sql注入
        body= XSSUtil.killXSS(body);//防预XSS,Sql注入
        if(draftService.addDraft(studentId,title,body))return "yes";
        else return "no";
    }

    /**
     * 删除草稿接口
     * @param draftId
     * @return
     */
    @RequestMapping(value = "/delDraft",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String delDraft(@RequestParam long draftId){
        if(draftService.delDraft(draftId))return "yes";
        return "no";
    }
}
