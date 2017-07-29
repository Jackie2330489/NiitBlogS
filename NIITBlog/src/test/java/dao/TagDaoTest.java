package dao;

import entity.Tag;
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
public class TagDaoTest {

    @Resource
    private TagDao tagDao;

    @Test
    public void getTagsByArticleId() throws Exception {
        long id=1000;
        List<Tag> tags=tagDao.getTagsByArticleId(id);
        for(Tag t:tags){
            System.out.println(t.toString());
        }
    }

    @Test
    public void getArtclesByTagName() throws Exception {
    }

}