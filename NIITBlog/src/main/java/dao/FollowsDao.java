package dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by Justin on 2017/7/21.
 */
public interface FollowsDao {
    int getNumOfFollowing(String studentId);
    int getNumOfFollowers(String studentId);
    //未完成
    int addFollow(@Param("fromWhoId") String fromWhoId,@Param("toWhoId") String toWhoId);
    //未完成
    int delFollow(@Param("fromWhoId") String fromWhoId,@Param("toWhoId") String toWhoId);
}
