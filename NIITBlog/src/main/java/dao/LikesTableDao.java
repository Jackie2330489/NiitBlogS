package dao;

import entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface LikesTableDao {
    int getNumOfLikers(long articleId);
    List<Student> getLikers(long articleId);
    int getNumOfAllLikes(String studentId);
    int likeIt(@Param("studentId") String studentId,@Param("articleId") long articleId);
}