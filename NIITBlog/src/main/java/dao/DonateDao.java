package dao;

import entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface DonateDao {
    int getNumOfDonators(long article);
    List<Student> getDonators(long article);
    int getSumOfDonation(long article);
    int getDonateSum(String studentId);
    int getEarnsSum(String studentId);
    //未完成
    int addDonate(@Param("studentId") String studentId,@Param("articleId") long articleId,@Param("money") int money);
}
