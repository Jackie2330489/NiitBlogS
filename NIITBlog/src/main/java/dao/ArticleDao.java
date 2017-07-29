package dao;

import entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/18.
 */
public interface ArticleDao {
    Article getArticleById(long articleId);
    List<Article> getArticlesByLimit(@Param("offset") int offset,@Param("limit") int limit);
    int getNumOfArticles(String studentId);
    List<Article> getArticlesByStudentId(String studentId);
    List<Article> getHotArticles();
    List<Article> getArticlesAll(String lastArticleDate);
    int getNumNewArticles(String firstArticleDate);
    List<Article> getNewArtilesAll(String firstArticleDate);
    int getNumNewArticlesFoloow(@Param("firstArticleDate") String firstArticleDate,@Param("studentId") String studentId);
    List<Article> getNewArtilesFollow(@Param("firstArticleDate") String firstArticleDate,@Param("studentId") String studentId);
    //未完成
//    int addArticle(@Param("authorId")String authorId,@Param("title")String title,@Param("body") String body,@Param("tags")String[] tags);
//    //未完成
//    int updateArticleDelStatus(long articleId);
//    //未完成
//    int updateArticle(@Param("article") long article,@Param("title") String title,@Param("body") String body,@Param("tags")String[] tags);
//    //未完成
//    List<Article> search(String value);
}
