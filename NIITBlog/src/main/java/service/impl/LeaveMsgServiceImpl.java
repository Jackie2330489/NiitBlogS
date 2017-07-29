package service.impl;

import dao.LeaveMsgDao;
import org.springframework.stereotype.Service;
import service.LeaveMsgService;

/**
 * Created by Justin on 2017/7/29.
 */
@Service
public class LeaveMsgServiceImpl implements LeaveMsgService {
    /**
     * 未完成
     * @param fromWhoId
     * @param toWhoId
     * @param msg
     * @return
     */
    public boolean addLeaveMsg(String fromWhoId, String toWhoId, String msg) {
        return false;
    }

    /**
     * 未完成
     * @param lmsgId
     * @return
     */
    public boolean delLeaveMsg(long lmsgId) {
        return false;
    }
}
