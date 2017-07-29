package service;

/**
 * Created by Justin on 2017/7/29.
 */
public interface DonateService {
    boolean donateArticle(String donatorId,long articleId,int money);
}
