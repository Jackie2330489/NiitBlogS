package entity;

import java.util.Date;

/**
 * Created by Justin on 2017/7/21.
 */
public class Follows {
    private String fromWhoId;
    private String fromWhoName;
    private String toWhoId;
    private String toWhoName;
    private Date time;

    @Override
    public String toString() {
        return "Follows{" +
                "fromWhoId='" + fromWhoId + '\'' +
                ", fromWhoName='" + fromWhoName + '\'' +
                ", toWhoId='" + toWhoId + '\'' +
                ", toWhoName='" + toWhoName + '\'' +
                ", time=" + time +
                '}';
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
