package dao;

import entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class LikesTableDaoTest {

    @Resource
    private LikesTableDao likesTableDao;

    @Test
    public void getNumOfLikers() throws Exception {
        long id=1000;
        int num=likesTableDao.getNumOfLikers(id);
        System.out.println("likers:"+num);
    }

    @Test
    public void getLikers() throws Exception {
        long id=1000;
        List<Student> students=likesTableDao.getLikers(id);
        for(Student s:students){
            System.out.println(s.toString());
        }
    }

    @Test
    public void getNumOfAllLikes() throws Exception {
        String id="jiumam123";
        int num=likesTableDao.getNumOfAllLikes(id);
        System.out.println("likers:"+num);
    }

    @Test
    public void likeIt() throws Exception {
        String id="jiumam123";
        long artid=1000L;
        int i=likesTableDao.likeIt(id,artid);
        System.out.println("likes:"+i);
    }
}