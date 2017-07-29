package dao;

import entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StudentDaoTest {

    @Resource
    private StudentDao studentDao;

    @Test
    public void getStudentById() throws Exception {
        String id="jiumam123";
        Student student=studentDao.getStudentById(id);
        System.out.println(student.toString());
    }

    @Test
    public void getPasswordById() throws Exception {
        String id="jiumam123";
        System.out.println("Shadow:"+studentDao.getPasswordById(id));
    }

    @Test
    public void getStudentsByFilter() throws Exception {
        int grade=2014;
        String spec="Java";
        int sclass=3;
        List<Student> students=studentDao.getStudentsByFilter(grade,spec,sclass);
        for(Student s:students){
            System.out.println(s.toString());
        }
    }

    @Test
    public void insertByRegister() throws Exception{
        String studentId="aaa123";
        String shadow="aaa123";
        String name="山山";
        int grade=2014;
        String spec="Java";
        int sclass=2;
        int cols=studentDao.insertByRegister(studentId,name,grade,spec,sclass,shadow);
        System.out.println("Affected:"+cols);
    }

    @Test
    public void getNumOfSameId() throws Exception{
        String sid="jiumam123";
        int cols=studentDao.getNumOfSameId(sid);
        System.out.println("Num:"+cols);
    }

    @Test
    public void getName() throws Exception{
        String sid="jiumam123";
        String name=studentDao.getNameOfStudent(sid);
        System.out.println("Name:"+name);
    }
}