package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface WhisperService {
    boolean addWhisper(String fromWhoId,String toWhoId,String msg);
}
