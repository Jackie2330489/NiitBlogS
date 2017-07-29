package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SensitiveWordService;
import util.XSSUtil;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/sword")
public class SensitiveWordController {
    @Autowired
    private SensitiveWordService sensitiveWordService;

    /**
     * 添加敏感词汇接口
     * @param swordId
     * @return
     */
    @RequestMapping(value = "/addSword",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addLeaveMsg(@RequestParam String sword){
        sword= XSSUtil.killXSS(sword);//防预XSS,Sql注入
        if(sensitiveWordService.addSensitiveWord(sword))return "yes";
        return "no";
    }

    /**
     * 删除敏感词汇接口
     * @param swordId
     * @return
     */
    @RequestMapping(value = "/delSword",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addLeaveMsg(@RequestParam long swordId){
        if(sensitiveWordService.delSensitiveWord(swordId))return "yes";
        return "no";
    }
}
