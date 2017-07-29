package entity;

/**
 * Created by Justin on 2017/7/21.
 */
public class Comment {
    private long commentId;
    private long articleId;
    private String fromWhoId;
    private String fromWhoName;
    private String toWhoId;
    private String toWhoName;
    private String text;
    private String time;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", articleId=" + articleId +
                ", fromWhoId='" + fromWhoId + '\'' +
                ", fromWhoName='" + fromWhoName + '\'' +
                ", toWhoId='" + toWhoId + '\'' +
                ", toWhoName='" + toWhoName + '\'' +
                ", text='" + text + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getFromWhoId() {
        return fromWhoId;
    }

    public void setFromWhoId(String fromWhoId) {
        this.fromWhoId = fromWhoId;
    }

    public String getFromWhoName() {
        return fromWhoName;
    }

    public void setFromWhoName(String fromWhoName) {
        this.fromWhoName = fromWhoName;
    }

    public String getToWhoId() {
        return toWhoId;
    }

    public void setToWhoId(String toWhoId) {
        this.toWhoId = toWhoId;
    }

    public String getToWhoName() {
        return toWhoName;
    }

    public void setToWhoName(String toWhoName) {
        this.toWhoName = toWhoName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
