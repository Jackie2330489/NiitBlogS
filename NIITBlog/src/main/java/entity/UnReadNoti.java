package entity;

/**
 * Created by Justin on 2017/7/28.
 */
public class UnReadNoti {
    private String name;
    private int fans;
    private int likes;
    private int comments;
    private int donates;
    private int whispers;
    private int leavemsgs;

    public UnReadNoti(String name, int fans, int likes, int comments, int donates, int whispers, int leavemsgs) {
        this.name = name;
        this.fans = fans;
        this.likes = likes;
        this.comments = comments;
        this.donates = donates;
        this.whispers = whispers;
        this.leavemsgs = leavemsgs;
    }

    @Override
    public String toString() {
        return "UnReadNoti{" +
                "name='" + name + '\'' +
                ", fans=" + fans +
                ", likes=" + likes +
                ", comments=" + comments +
                ", donates=" + donates +
                ", whispers=" + whispers +
                ", leavemsgs=" + leavemsgs +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getDonates() {
        return donates;
    }

    public void setDonates(int donates) {
        this.donates = donates;
    }

    public int getWhispers() {
        return whispers;
    }

    public void setWhispers(int whispers) {
        this.whispers = whispers;
    }

    public int getLeavemsgs() {
        return leavemsgs;
    }

    public void setLeavemsgs(int leavemsgs) {
        this.leavemsgs = leavemsgs;
    }

}
