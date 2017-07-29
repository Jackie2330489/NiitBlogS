package entity;

import java.util.Date;

/**
 * Created by Justin on 2017/7/21.
 */
public class LikesTable {
    private String likerId;
    private String likerName;
    private long belikedId;
    private String belikedAuthorName;
    private Date time;

    @Override
    public String toString() {
        return "LikesTable{" +
                "likerId='" + likerId + '\'' +
                ", likerName='" + likerName + '\'' +
                ", belikedId=" + belikedId +
                ", belikedAuthorName='" + belikedAuthorName + '\'' +
                ", time=" + time +
                '}';
    }

    public String getLikerId() {
        return likerId;
    }

    public void setLikerId(String likerId) {
        this.likerId = likerId;
    }

    public String getLikerName() {
        return likerName;
    }

    public void setLikerName(String likerName) {
        this.likerName = likerName;
    }

    public long getBelikedId() {
        return belikedId;
    }

    public void setBelikedId(long belikedId) {
        this.belikedId = belikedId;
    }

    public String getBelikedAuthorName() {
        return belikedAuthorName;
    }

    public void setBelikedAuthorName(String belikedAuthorName) {
        this.belikedAuthorName = belikedAuthorName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
