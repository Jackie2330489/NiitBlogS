package dao;

import entity.Draft;
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
public class DraftDaoTest {

    @Resource
    private DraftDao draftDao;

    @Test
    public void getDraftsByStudentId() throws Exception {
        String sid="jiumam123";
        List<Draft> drafts=draftDao.getDraftsByStudentId(sid);
        for(Draft d:drafts){
            System.out.println(d.toString());
        }
    }

}