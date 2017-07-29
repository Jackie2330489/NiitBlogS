package service.impl;

import dao.LikesTableDao;
import dao.NotificationDao;
import dao.StudentDao;
import entity.UnReadNoti;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.NotificationService;

/**
 * Created by Justin on 2017/7/28.
 */
@Service
public class NotificationServiceImpl implements NotificationService {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NotificationDao notificationDao;

    @Autowired
    private StudentDao studentDao;

    /**
     * 获取未读消息条数
     * @param studentId
     * @return
     */
    public UnReadNoti getUnReadNoti(String studentId) {
        UnReadNoti unReadNoti=new UnReadNoti(studentDao.getNameOfStudent(studentId),notificationDao.getNumOfUnReadFans(studentId),notificationDao.getNumOfUnReadLikes(studentId),
                notificationDao.getNumOfUnReadComments(studentId),notificationDao.getNumOfUnReadDonates(studentId),notificationDao.getNumOfUnReadWhispers(studentId),
                notificationDao.getNumOfUnReadLeaveMsgs(studentId));
        return unReadNoti;
    }

    public boolean addNoti(String fromWhoId, String toWhoId, String text, int status) {
        return false;
    }

    public boolean readNoti(long notiId) {
        return false;
    }

    public boolean delNoti(long notiId) {
        return false;
    }
}
