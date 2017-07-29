package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface LikesTableService {
    /**
     * 未完成
     * @param studentId
     * @param articleId
     * @return
     */
    boolean addLike(String studentId,long articleId);

    /**
     * 未完成
     * @param studentId
     * @param articleId
     * @return
     */
    boolean delLike(String studentId,long articleId);
}
