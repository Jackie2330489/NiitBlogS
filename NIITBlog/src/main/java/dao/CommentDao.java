package dao;

import entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface CommentDao {
    int getNumOfComments(long articleId);
    List<Comment> getComments(long articleId);
    //未完成
    int addComment(@Param("fromWhoId") String fromWhoId,@Param("toWhoId") String toWhoId,@Param("text") String text);
    //未完成
    int delComment(@Param("commentId")long commentId);
}
