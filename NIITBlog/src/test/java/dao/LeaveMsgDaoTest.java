package dao;

import entity.LeaveMsg;
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
public class LeaveMsgDaoTest {

    @Resource
    private LeaveMsgDao leaveMsgDao;

    @Test
    public void getNumOfLeaveMsgs() throws Exception {
        String id="jiumam123";
        System.out.println("Num Of LeaveMsgs:"+leaveMsgDao.getNumOfLeaveMsgs(id));
    }

    @Test
    public void getLeaveMsgs() throws Exception {
        String id="jiumam123";
        List<LeaveMsg> leaveMsgs=leaveMsgDao.getLeaveMsgs(id);
        for(LeaveMsg lm:leaveMsgs){
            System.out.println(lm.toString());
        }
    }

}