package dao;

import entity.ArticleFile;

import java.util.List;

/**
 * Created by Justin on 2017/7/23.
 */
public interface ArticleFileDao {
    /*获取博文的附件*/
    List<ArticleFile> getArticleFiles(long articleId);
}
