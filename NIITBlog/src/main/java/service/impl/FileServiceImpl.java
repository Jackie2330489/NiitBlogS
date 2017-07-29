package service.impl;

import dto.NiitBlogResult;
import entity.HeadImg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import service.FileService;
import util.ImageCompressUtil;
import util.ImgCut;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;

/**
 * Created by Justin on 2017/7/23.
 */
@Service
public class FileServiceImpl implements FileService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 上传头像接口
     * @param file
     * @param request
     * @return
     */
    public NiitBlogResult<HeadImg> upload(MultipartFile file, HttpServletRequest request) {
        String contentType = file.getContentType();//获取上传文件的格式
        if (!contentType.equals("image/jpeg") && !contentType.equals("image/png")) {
            return new NiitBlogResult<HeadImg>(false, "只允许上传jpeg,jpg,png格式的图片");
        }//检验上传文件的格式
        String path = request.getSession().getServletContext().getRealPath("upload");
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");//随机的UUID
        String imageName = contentType.substring(contentType.indexOf("/") + 1);
        String fileName = uuid + "." + imageName;
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();//铺好路径
        }
        try {
            file.transferTo(targetFile);//保存上传文件
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        ImgCut.imgCut(targetFile, path, uuid, imageName, 0, 0, 200, 200);//图片切割
        String backUrl = request.getScheme() +
                "://" + request.getServerName() +
                ":" + request.getServerPort() + request.getContextPath() +
                "/upload/" + uuid + "_cut." + imageName;
        HeadImg headImg = new HeadImg();
        String smallUrl=ImageCompressUtil.zipImageFile(targetFile.getAbsolutePath(),32,32,1f,"x2");
        //图片等比例缩放
        headImg.setSmallPath(smallUrl);
        headImg.setBigPath(backUrl);
        return new NiitBlogResult<HeadImg>(true, headImg);
    }

    /**
     * 附件下载接口
     * @param request
     * @param response
     * @param storeName
     * @param contentType
     * @param realName
     */
    public void download(HttpServletRequest request, HttpServletResponse response, String storeName, String contentType, String realName) {
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;

            String ctxPath = request.getSession().getServletContext()
                    .getRealPath("/")
                    + "upload/";
            String downLoadPath = ctxPath + storeName;
            long fileLength = new File(downLoadPath).length();
            response.setContentType(contentType);
            response.setHeader("Content-disposition", "attachment; filename="
                    + new String(realName.getBytes("utf-8"), "ISO8859-1"));
            response.setHeader("Content-Length", String.valueOf(fileLength));

            bis = new BufferedInputStream(new FileInputStream(downLoadPath));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

    }
}
