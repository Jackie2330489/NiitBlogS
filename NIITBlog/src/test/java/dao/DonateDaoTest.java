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
public class DonateDaoTest {

    @Resource
    private DonateDao donateDao;

    @Test
    public void getNumOfDonators() throws Exception {
        System.out.println("Num Of Donators:"+donateDao.getNumOfDonators(1000L));
    }

    @Test
    public void getDonators() throws Exception {
        List<Student> students=donateDao.getDonators(1000L);
        for(Student s:students){
            System.out.println(s.toString());
        }
    }

    @Test
    public void getSumOfDonation() throws Exception {
        System.out.println("Money:"+donateDao.getSumOfDonation(1000L));
    }

    @Test
    public void getDonateSum() throws Exception {
        System.out.println("DonatesCount:"+donateDao.getDonateSum("banana123"));
    }

    @Test
    public void getEarnsSum() throws Exception {
        System.out.println("EarnsCount:"+donateDao.getEarnsSum("jiumam123"));
    }
}