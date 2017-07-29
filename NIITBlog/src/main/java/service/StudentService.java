package service;

import entity.Student;

/**
 * Created by Justin on 2017/7/27.
 */
public interface StudentService {
    Student getStudent(String studentId);
    boolean checkCookieValue(String usid,String niitid,String ip);
    boolean checkIdIsOnly(String studentId);
    String register(String studentId,String name,int grade,String spec,int sclass,String shadow,String ip);
    String login(String studentId,String shadow,String ip);
}
