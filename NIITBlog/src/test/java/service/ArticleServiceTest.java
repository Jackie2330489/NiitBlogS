package service;

import entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class ArticleServiceTest {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ArticleService articleService;

    @Test
    public void getById() throws Exception {
        long id=1000;
        Article article=articleService.getById(id);
        logger.info("article={}",article);
    }

    @Test
    public void getByPage() throws Exception {
        List<Article> articles=articleService.getByPage(1);
        logger.info("articles={}",articles);
    }

}