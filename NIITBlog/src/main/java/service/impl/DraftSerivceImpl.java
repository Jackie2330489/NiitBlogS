package service.impl;

import dao.DraftDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DraftService;

/**
 * Created by Justin on 2017/7/29.
 */
@Service
public class DraftSerivceImpl implements DraftService{

    @Autowired
    private DraftDao draftDao;

    public boolean addDraft(String studentId, String title, String body) {
        int cols=draftDao.addDraft(studentId,title,body);
        if(cols!=0)return true;
        else return false;
    }

    public boolean delDraft(long draftId) {
        int cols=draftDao.delDraft(draftId);
        if(cols!=0)return true;
        else return false;
    }
}
