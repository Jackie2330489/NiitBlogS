package util;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/24.
 */
public class ImgCutTest {
    @Test
    public void imgCut() throws Exception {
        String path="d:/Files/IdeaProjects/NIITBlog/target/NIITBlog/upload/";
        String uuid="1ff00aa11465439f8653000a2cdafa5f";
        String imageName="jpeg";
        File file=new File(path,uuid+"."+imageName);
        ImgCut.imgCut(file,path,uuid,imageName,0,0,200,200);
    }

}