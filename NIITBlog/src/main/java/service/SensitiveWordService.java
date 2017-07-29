package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface SensitiveWordService {
    boolean addSensitiveWord(String sword);
    boolean delSensitiveWord(long swordId);
}
