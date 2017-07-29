package service;

import entity.UnReadNoti;

/**
 * Created by Justin on 2017/7/28.
 */
public interface NotificationService {
    UnReadNoti getUnReadNoti(String studentId);
    //未完成
    boolean addNoti(String fromWhoId,String toWhoId,String text,int status);
    //未完成
    boolean readNoti(long notiId);
    //未完成
    boolean delNoti(long notiId);
}
