package dao;

import entity.ArticleFile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ArticleFileDaoTest {

    @Resource
    private ArticleFileDao articleFileDao;

    @Test
    public void getArticleFiles() throws Exception {
        long id=1000;
        List<ArticleFile> articleFiles= articleFileDao.getArticleFiles(id);
        for(ArticleFile af:articleFiles){
            System.out.println(af.toString());
        }
    }

}