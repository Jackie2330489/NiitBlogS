package dao;

import entity.Article;
import entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public interface TagDao {
    List<Tag> getTagsByArticleId(long articleId);
    List<Article> getArtclesByTagName(String tagName);
    int addTag(@Param("articleId") long articleId,@Param("tagName") String tagName);
}
