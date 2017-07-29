package service.impl;

import dao.ArticleDao;
import dao.TagDao;
import entity.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ArticleService;

import java.util.List;

/**
 * Created by Justin on 2017/7/18.
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private TagDao tagDao;

    public Article getById(long articleId){
        Article article=articleDao.getArticleById(articleId);
        return article;
    }

    /**
     * 没用到
     * @param page
     * @return
     */
    public List<Article> getByPage(int page) {
        int offset=(page-1)*10;
        int limit=offset+10;
        List<Article> articles=articleDao.getArticlesByLimit(offset,limit);
        return articles;
    }


    public List<Article> getSimpleAll(String lastArticleDate) {
        List<Article> articles=articleDao.getArticlesAll(lastArticleDate);
        return articles;
    }

    public int getNumOfNewAll(String firstArticleDate) {
        return articleDao.getNumNewArticles(firstArticleDate);
    }

    public List<Article> getNewArticlesAll(String firstArticleDate) {
        return articleDao.getNewArtilesAll(firstArticleDate);
    }

    public int getNumOfNewFollow(String firstArticleDate, String studentId) {
        return articleDao.getNumNewArticlesFoloow(firstArticleDate,studentId);
    }

    public List<Article> getNewArticlesFollow(String firstArticleDate, String studentId) {
        return getNewArticlesFollow(firstArticleDate,studentId);
    }

    public List<Article> getHotArticles() {
        return articleDao.getHotArticles();
    }

    /**
     * 未完成
     * @param authorId
     * @param title
     * @param body
     * @param tags
     * @return
     */
    public boolean addArticle(String authorId, String title, String body, String[] tags) {
//        if(articleDao.addArticle(authorId,title,body,tags)==0)return false;
//        else return true;
        return false;
    }

    /**
     * 未完成
     * @param articleId
     * @return
     */
    public boolean delArticle(long articleId) {
//        if(articleDao.updateArticleDelStatus(articleId)!=0)return true;
//        else return false;
        return false;
    }

    /**
     * 未完成
     * @param articleId
     * @param title
     * @param body
     * @param tags
     * @return
     */
    public boolean updateArticle(long articleId, String title, String body, String[] tags) {
//        articleDao.updateArticle(articleId,title,body,tags);
        return false;
    }

    /**
     * 未完成
     * @param value
     * @return
     */
    public List<Article> searchArticle(String value) {
//        List<Article> articles=articleDao.search(value);
//        return articles;
        return null;
    }
}
