package entity;

import java.util.Date;
import java.util.List;

/**
 * Created by Justin on 2017/7/21.
 */
public class Student {
    private String studentId;
    private String shadow;
    private String name;
    private int sex;
    private Date birthday;
    private String qq;
    private int grade;
    private String spec;
    private int sclass;
    private String intro;
    private int money;
    private int likes;
    private int donates;
    private int earns;
    private int following;
    private int followers;
    private int articlesNum;
//    private int notificationsNum;
    private int leaveMsgNum;
    private List<LeaveMsg> leaveMsgs;
    private List<Article> articles;
    private HeadImg headImg;

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", shadow='" + shadow + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", qq='" + qq + '\'' +
                ", grade=" + grade +
                ", spec='" + spec + '\'' +
                ", sclass=" + sclass +
                ", intro='" + intro + '\'' +
                ", money=" + money +
                ", likes=" + likes +
                ", donates=" + donates +
                ", earns=" + earns +
                ", following=" + following +
                ", followers=" + followers +
                ", articlesNum=" + articlesNum +
                ", leaveMsgNum=" + leaveMsgNum +
                ", leaveMsgs=" + leaveMsgs +
                ", articles=" + articles +
                ", headImg=" + headImg +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getShadow() {
        return shadow;
    }

    public void setShadow(String shadow) {
        this.shadow = shadow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getSclass() {
        return sclass;
    }

    public void setSclass(int sclass) {
        this.sclass = sclass;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDonates() {
        return donates;
    }

    public void setDonates(int donates) {
        this.donates = donates;
    }

    public int getEarns() {
        return earns;
    }

    public void setEarns(int earns) {
        this.earns = earns;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getArticlesNum() {
        return articlesNum;
    }

    public void setArticlesNum(int articlesNum) {
        this.articlesNum = articlesNum;
    }

    public int getLeaveMsgNum() {
        return leaveMsgNum;
    }

    public void setLeaveMsgNum(int leaveMsgNum) {
        this.leaveMsgNum = leaveMsgNum;
    }

    public List<LeaveMsg> getLeaveMsgs() {
        return leaveMsgs;
    }

    public void setLeaveMsgs(List<LeaveMsg> leaveMsgs) {
        this.leaveMsgs = leaveMsgs;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public HeadImg getHeadImg() {
        return headImg;
    }

    public void setHeadImg(HeadImg headImg) {
        this.headImg = headImg;
    }
}
