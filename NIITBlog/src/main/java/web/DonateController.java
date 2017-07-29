package web;

import dto.NiitBlogResult;
import entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DonateService;
import util.XSSUtil;

import java.util.List;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/donate")
public class DonateController {
    @Autowired
    private DonateService donateService;

    /**
     * 打赏接口
     * @param donatorId
     * @param articleId
     * @param money
     * @return
     */
    @RequestMapping(value = "/donateArticle",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String donateArticle(@RequestParam String donatorId,@RequestParam long articleId,@RequestParam int money){
        donatorId= XSSUtil.killXSS(donatorId);//防预XSS,Sql注入
        if(donateService.donateArticle(donatorId,articleId,money))return "yes";
        else return "no";
    }
}
