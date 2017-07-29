package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.WhisperService;
import util.XSSUtil;

/**
 * Created by Justin on 2017/7/29.
 */
@Controller
@RequestMapping("/whisper")
public class WhisperController {
    @Autowired
    private WhisperService whisperService;

    /**
     * 添加私信接口
     * @param fromWhoId
     * @param toWhoId
     * @param msg
     * @return
     */
    @RequestMapping(value = "/addWhisper",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addWhisper(@RequestParam String fromWhoId, @RequestParam String toWhoId, @RequestParam String msg){
        fromWhoId= XSSUtil.killXSS(fromWhoId);//防预XSS,Sql注入
        toWhoId= XSSUtil.killXSS(toWhoId);//防预XSS,Sql注入
        msg= XSSUtil.killXSS(msg);//防预XSS,Sql注入
        if(whisperService.addWhisper(fromWhoId,toWhoId,msg))return "yes";
        return "no";
    }
}
