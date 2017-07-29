package service.impl;

import dao.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CommentService;

/**
 * Created by Justin on 2017/7/29.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    public boolean addComment(String fromWhoId, String toWhoId, String text) {
        int affectCols=commentDao.addComment(fromWhoId,toWhoId,text);
        if(affectCols!=0)return true;
        else return false;
    }

    public boolean delComment(long commentId) {
        int affectCols=commentDao.delComment(commentId);
        if(affectCols!=0)return true;
        else return false;
    }
}
