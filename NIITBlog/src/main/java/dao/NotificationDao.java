package dao;

import entity.Notification;
import entity.UnReadNoti;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface NotificationDao {
    List<Notification> getPersonalNotifications(@Param("offset") int offset,@Param("limit") int limit,@Param("studentId") String studentId);
    int getNumOfUnReadFans(String studentId);
    int getNumOfUnReadLikes(String studentId);
    int getNumOfUnReadComments(String studentId);
    int getNumOfUnReadDonates(String studentId);
    int getNumOfUnReadWhispers(String studentId);
    int getNumOfUnReadLeaveMsgs(String studentId);
}
