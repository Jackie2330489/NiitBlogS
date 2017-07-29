package dao;

import entity.LeaveMsg;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface LeaveMsgDao {
    int getNumOfLeaveMsgs(String studentId);
    List<LeaveMsg> getLeaveMsgs(String studentId);
}
