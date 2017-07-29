package entity;

import java.util.Date;
import java.util.List;

/**
 * Created by Justin on 2017/7/18.
 */
public class Article {
    private long articleId;
    private String authorId;
    private String authorName;
    private String title;
    private String body;
    private int status;
    private Date published;
    private Date lastModify;
    private int likes;
    private List<Student> likers;
    private int donatorNum;
    private List<Student> donators;
    private int donateSum;
    private List<Tag> tags;
    private int commentNum;
    private List<Comment> comments;
    private List<ArticleFile> articleFiles;
    private int ilike;

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", status=" + status +
                ", published=" + published +
                ", lastModify=" + lastModify +
                ", likes=" + likes +
                ", likers=" + likers +
                ", donatorNum=" + donatorNum +
                ", donators=" + donators +
                ", donateSum=" + donateSum +
                ", tags=" + tags +
                ", commentNum=" + commentNum +
                ", comments=" + comments +
                ", articleFiles=" + articleFiles +
                ", ilike=" + ilike +
                '}';
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Student> getLikers() {
        return likers;
    }

    public void setLikers(List<Student> likers) {
        this.likers = likers;
    }

    public int getDonatorNum() {
        return donatorNum;
    }

    public void setDonatorNum(int donatorNum) {
        this.donatorNum = donatorNum;
    }

    public List<Student> getDonators() {
        return donators;
    }

    public void setDonators(List<Student> donators) {
        this.donators = donators;
    }

    public int getDonateSum() {
        return donateSum;
    }

    public void setDonateSum(int donateSum) {
        this.donateSum = donateSum;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<ArticleFile> getArticleFiles() {
        return articleFiles;
    }

    public void setArticleFiles(List<ArticleFile> articleFiles) {
        this.articleFiles = articleFiles;
    }

    public int isIlike() {
        return ilike;
    }

    public void setIlike(int ilike) {
        this.ilike = ilike;
    }
}