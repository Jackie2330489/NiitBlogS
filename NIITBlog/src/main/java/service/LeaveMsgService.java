package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface LeaveMsgService {
    boolean addLeaveMsg(String fromWhoId,String toWhoId,String msg);
    boolean delLeaveMsg(long lmsgId);
}
