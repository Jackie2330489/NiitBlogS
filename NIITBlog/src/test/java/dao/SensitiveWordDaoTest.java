package dao;

import entity.SensitiveWord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SensitiveWordDaoTest {

    @Resource
    private SensitiveWordDao sensitiveWordDao;

    @Test
    public void getSensitiveWords() throws Exception {
        List<SensitiveWord> sensitiveWords=sensitiveWordDao.getSensitiveWords();
        for(SensitiveWord sw:sensitiveWords){
            System.out.println(sw.toString());
        }
    }

}