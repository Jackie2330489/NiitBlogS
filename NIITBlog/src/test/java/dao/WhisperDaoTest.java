package dao;

import entity.Whisper;
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
public class WhisperDaoTest {

    @Resource
    private WhisperDao whisperDao;

    @Test
    public void getWhispers() throws Exception {
        String s1="jiumam123";
        String s2="banana123";
        int offset=0;
        int limit=10;
        List<Whisper> whispers=whisperDao.getWhispers(s1,s2,offset,limit);
        for(Whisper w:whispers){
            System.out.println(w.toString());
        }
    }

}