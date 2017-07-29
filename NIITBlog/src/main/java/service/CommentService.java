package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface CommentService {
    boolean addComment(String fromWhoId,String toWhoId,String text);
    boolean delComment(long commentId);
}
