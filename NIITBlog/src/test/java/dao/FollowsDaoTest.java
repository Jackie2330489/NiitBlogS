package dao;

import entity.Follows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class FollowsDaoTest {

    @Resource
    private FollowsDao followsDao;

    @Test
    public void getNumOfFollowing() throws Exception {
        String id="jiumam123";
        System.out.println(id+" is Following:"+followsDao.getNumOfFollowing(id));
    }

    @Test
    public void getNumOfFollowers() throws Exception {
        String id="jiumam123";
        System.out.println(id+"'s Followers:"+followsDao.getNumOfFollowers(id));
    }

}