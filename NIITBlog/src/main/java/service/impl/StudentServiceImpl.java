package service.impl;

import dao.StudentDao;
import dao.cache.RedisDao;
import entity.Login;
import entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.StudentService;
import util.Md5Util;

/**
 * Created by Justin on 2017/7/27.
 */
@Service
public class StudentServiceImpl implements StudentService {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private RedisDao redisDao;

    public Student getStudent(String studentId) {
        Student student=redisDao.getStudent(studentId);
        if(student!=null)return student;
        else{
            student=studentDao.getStudentById(studentId);
            redisDao.putStudent(studentId);
            return student;
        }
    }

    public boolean checkCookieValue(String usid, String niitid, String ip) {
        if(redisDao.getLogin(niitid)!=null)return true;
        String shadow=studentDao.getPasswordById(usid);
        String md5=Md5Util.getMd5(ip+shadow);
        if(niitid.equals(md5)){
            redisDao.putLogin(new Login(niitid,usid));
            return true;
        }
        return false;
    }

    public boolean checkIdIsOnly(String studentId) {
        if(studentDao.getNumOfSameId(studentId)==0)return true;
        else return false;
    }

    public String register(String studentId, String name, int grade, String spec, int sclass, String shadow, String ip) {
        int affectCols=studentDao.insertByRegister(studentId,name,grade,spec,sclass,shadow);
        if(affectCols==0)return "no";
        String md5= Md5Util.getMd5(ip+shadow);
        Login login=new Login(md5,studentId);
        if(redisDao.getLogin(md5)==null){
            redisDao.putLogin(login);
        }
        return md5;
    }

    public String login(String studentId, String shadow, String ip) {
        String realPassword=studentDao.getPasswordById(studentId);
//        logger.error("studentId:"+studentId+",shadow:"+shadow+",realPassword:"+realPassword);
        if(!shadow.equals(realPassword))return "no";
        String md5= Md5Util.getMd5(ip+shadow);
        Login login=new Login(md5,studentId);
        if(redisDao.getLogin(md5)==null){
            redisDao.putLogin(login);
        }
        return md5;
    }
}
