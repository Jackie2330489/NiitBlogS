package service.impl;

import dao.FollowsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.FollowService;

/**
 * Created by Justin on 2017/7/29.
 */
@Service
public class FollowServiceImpl implements FollowService {

    @Autowired
    private FollowsDao followsDao;

    public boolean addFollow(String fromWhoId, String toWhoId) {
        int cols=followsDao.addFollow(fromWhoId,toWhoId);
        if(cols!=0)return true;
        return false;
    }

    public boolean delFollow(String fromWhoId, String toWhoId) {
        int cols=followsDao.delFollow(fromWhoId,toWhoId);
        if(cols!=0)return true;
        return false;
    }
}
