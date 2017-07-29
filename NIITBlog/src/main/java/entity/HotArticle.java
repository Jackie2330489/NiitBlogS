package entity;

/**
 * Created by Justin on 2017/7/21.
 */
public class HotArticle {
    private long hotArticleId;
    private int status;

    @Override
    public String toString() {
        return "HotArticle{" +
                "hotArticleId=" + hotArticleId +
                ", status=" + status +
                '}';
    }

    public long getHotArticleId() {
        return hotArticleId;
    }

    public void setHotArticleId(long hotArticleId) {
        this.hotArticleId = hotArticleId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
