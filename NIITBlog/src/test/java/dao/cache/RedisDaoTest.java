package dao.cache;

import dao.ArticleDao;
import entity.Article;
import entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RedisDaoTest {

    @Autowired
    private RedisDao redisDao;

    @Test
    public void testConnection() throws Exception{
        Jedis jedis=new Jedis("192.168.1.20",6379);
        jedis.auth("jiumam123");
        System.out.println(jedis.ping());
    }

    @Test
    public void getArticle() throws Exception {
        long id=1000;
        Article article=redisDao.getArticle(id);
        System.out.println(article.toString());
    }

    @Test
    public void putArticle() throws Exception {
        long id=1000;
        String result=redisDao.putArticle(id);
        System.out.println("Result:" +result);
    }

    @Test
    public void getStudent() throws Exception{
        String id="jiumam123";
        Student student=redisDao.getStudent(id);
        System.out.println(student.toString());
    }

    @Test
    public void putStudent() throws Exception{
        String id="jiumam123";
        String result=redisDao.putStudent(id);
        System.out.println("Result:"+result);
    }
}