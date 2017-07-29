package dao;

import entity.Whisper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface WhisperDao {
    List<Whisper> getWhispers(@Param("studentAId") String studentAId,@Param("studentBId") String studentBId,@Param("offset") int offset,@Param("limit") int limit);
}
