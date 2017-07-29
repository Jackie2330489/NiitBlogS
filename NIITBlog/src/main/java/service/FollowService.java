package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface FollowService {
    boolean addFollow(String fromWhoId,String toWhoId);
    boolean delFollow(String fromWhoId,String toWhoId);
}
