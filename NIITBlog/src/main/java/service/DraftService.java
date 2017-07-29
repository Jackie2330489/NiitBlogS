package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface DraftService {
    boolean addDraft(String studentId,String title,String body);
    boolean delDraft(long draftId);
}
