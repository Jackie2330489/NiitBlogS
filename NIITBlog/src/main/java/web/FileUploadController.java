package web;

import dto.NiitBlogResult;
import entity.HeadImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import service.FileService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Justin on 2017/7/23.
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value="/upload",method= RequestMethod.POST)
    @ResponseBody
    public NiitBlogResult<HeadImg> upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {
        return fileService.upload(file,request);
    }

    @RequestMapping(value="/download",method= RequestMethod.POST)
//    @ResponseBody
    public String download(HttpServletRequest request, HttpServletResponse response) {
        String storeName="1ff00aa11465439f8653000a2cdafa5f.jpeg";
        String realName="hahaha.jpeg";
        String contentType="image/jpeg";
        fileService.download(request,response,storeName,contentType,realName);
        return null;
    }
}
