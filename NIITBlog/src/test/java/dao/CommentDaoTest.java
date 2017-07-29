package dao;

import entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CommentDaoTest {

    @Resource
    private CommentDao commentDao;

    @Test
    public void getNumOfComments() throws Exception {
        long id=1000;
        System.out.println("NumOfComments:"+commentDao.getNumOfComments(id));
    }

    @Test
    public void getComments() throws Exception {
        long id=1000;
        List<Comment> comments=commentDao.getComments(id);
        for(Comment c:comments){
            System.out.println(c.toString());
        }
    }

}