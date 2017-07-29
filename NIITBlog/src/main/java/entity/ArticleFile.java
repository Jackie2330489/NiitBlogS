package entity;

/**
 * Created by Justin on 2017/7/23.
 */
public class ArticleFile {
    private long afId;
    private long articleId;
    private String storeName;
    private String realName;
    private String contentType;

    @Override
    public String toString() {
        return "ArticleFile{" +
                "afId=" + afId +
                ", articleId=" + articleId +
                ", storeName='" + storeName + '\'' +
                ", realName='" + realName + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }

    public long getAfId() {
        return afId;
    }

    public void setAfId(long afId) {
        this.afId = afId;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
