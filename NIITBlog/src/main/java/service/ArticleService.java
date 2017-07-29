package service;

import entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/18.
 */
public interface ArticleService {
    Article getById(long articleId);
    List<Article> getByPage(int page);
    List<Article> getSimpleAll(String lastArticleDate);
    int getNumOfNewAll(String firstArticleDate);
    List<Article> getNewArticlesAll(String firstArticleDate);
    int getNumOfNewFollow(String firstArticleDate, String studentId);
    List<Article> getNewArticlesFollow( String firstArticleDate, String studentId);
    List<Article> getHotArticles();
    boolean addArticle(String authorId,String title,String body,String[] tag);
    boolean delArticle(long articleId);
    boolean updateArticle(long articleId,String title,String body,String[] tags);
    List<Article> searchArticle(String value);
}
