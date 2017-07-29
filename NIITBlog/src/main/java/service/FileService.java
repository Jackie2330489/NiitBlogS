package service;

import dto.NiitBlogResult;
import entity.HeadImg;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Justin on 2017/7/23.
 */
public interface FileService {
    NiitBlogResult<HeadImg> upload(MultipartFile file, HttpServletRequest request);
    void download(HttpServletRequest request, HttpServletResponse response,String storeName,String contentType,String realName);
}
