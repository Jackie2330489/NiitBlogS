package dao;

import entity.Article;
import entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ArticleDaoTest {

    @Resource
    private ArticleDao articleDao;

    @Test
    public void getArticleById() throws Exception {
        long id=1000;
        Article article=articleDao.getArticleById(id);
        System.out.println(article.toString());
    }

    @Test
    public void getArticlesByLimit() throws Exception {
        List<Article> articles=articleDao.getArticlesByLimit(0,10);
        for(Article a:articles){
            System.out.println(a.toString());
        }
    }

    @Test
    public void getNumOfArticles() throws Exception {
        String id="jiumam123";
        System.out.println("getNumOfArticles:"+articleDao.getNumOfArticles(id));
    }

    @Test
    public void getArticlesByStudentId() throws Exception {
        String id="jiumam123";
        List<Article> articles=articleDao.getArticlesByStudentId(id);
        for(Article a:articles){
            System.out.println(a.toString());
        }
    }

    @Test
    public void getHotArticles() throws Exception {
        List<Article> articles=articleDao.getHotArticles();
        for(Article a:articles){
            System.out.println(a.toString());
        }
    }

    @Test
    public void getArticlesAll() throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String time=formatter.format(date);

        List<Article> articles=articleDao.getArticlesAll(time);
        System.out.println(articles.toString());
    }
}