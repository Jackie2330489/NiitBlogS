package dao;

import entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface StudentDao {
    int getNumOfSameId(String studentId);
    int insertByRegister(@Param("studentId") String studentId,@Param("name") String name,@Param("grade") int grade,@Param("spec") String spec,@Param("class") int sclass,@Param("shadow") String shadow);
    Student getStudentById(String studentId);
    String getPasswordById(String studentId);
    String getNameOfStudent(String studentId);
    List<Student> getStudentsByFilter(@Param("grade") int grade,@Param("spec") String spec,@Param("sclass") int sclass);
}
