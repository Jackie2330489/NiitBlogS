package dao;

import entity.Notification;
import entity.UnReadNoti;
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
public class NotificationDaoTest {

    @Resource
    private NotificationDao notificationDao;

    @Test
    public void getPersonalNotifications() throws Exception {
        String id="banana123";
        int offset=0;
        int limit=10;
        List<Notification> notifications=notificationDao.getPersonalNotifications(offset,limit,id);
        for(Notification n:notifications){
            System.out.println(n.toString());
        }
    }

    @Resource
    private  StudentDao studentDao;

    @Test
    public void getNumOfUnRead() throws Exception {
        String id="jiumam123";
        UnReadNoti unReadNoti=new UnReadNoti(studentDao.getNameOfStudent(id),notificationDao.getNumOfUnReadFans(id),notificationDao.getNumOfUnReadLikes(id),
                notificationDao.getNumOfUnReadComments(id),notificationDao.getNumOfUnReadDonates(id),notificationDao.getNumOfUnReadWhispers(id),
                notificationDao.getNumOfUnReadLeaveMsgs(id));
        System.out.println(unReadNoti);
    }

}