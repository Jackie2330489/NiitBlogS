package entity;

import java.util.Date;

/**
 * Created by Justin on 2017/7/21.
 */
public class Donate {
    private long did;
    private String donatorId;
    private String donatorName;
    private long earnArticleId;
    private String earnerId;
    private int money;
    private Date time;

    @Override
    public String toString() {
        return "Donate{" +
                "did=" + did +
                ", donatorId='" + donatorId + '\'' +
                ", donatorName='" + donatorName + '\'' +
                ", earnArticleId=" + earnArticleId +
                ", earnerId='" + earnerId + '\'' +
                ", money=" + money +
                ", time=" + time +
                '}';
    }

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public String getDonatorId() {
        return donatorId;
    }

    public void setDonatorId(String donatorId) {
        this.donatorId = donatorId;
    }

    public String getDonatorName() {
        return donatorName;
    }

    public void setDonatorName(String donatorName) {
        this.donatorName = donatorName;
    }

    public long getEarnArticleId() {
        return earnArticleId;
    }

    public void setEarnArticleId(long earnArticleId) {
        this.earnArticleId = earnArticleId;
    }

    public String getEarnerId() {
        return earnerId;
    }

    public void setEarnerId(String earnerId) {
        this.earnerId = earnerId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
