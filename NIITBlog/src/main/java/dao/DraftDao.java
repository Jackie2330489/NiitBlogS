package dao;

import entity.Draft;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface DraftDao {
    List<Draft> getDraftsByStudentId(String studentId);
    int addDraft(@Param("studentId") String studentId,@Param("title") String title,@Param("body") String body);
    int delDraft(long draftId);
}
