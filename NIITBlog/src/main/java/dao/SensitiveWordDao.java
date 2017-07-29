package dao;

import entity.SensitiveWord;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface SensitiveWordDao {
    List<SensitiveWord> getSensitiveWords();
}
