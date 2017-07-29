package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class StudentServiceTest {

    @Resource
    private StudentService studentService;

    @Test
    public void register() throws Exception {
    }

    @Test
    public void login() throws Exception {
//        studentService.login();
    }

}