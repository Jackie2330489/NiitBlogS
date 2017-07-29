package entity;

import java.util.Date;

/**
 * Created by Justin on 2017/7/21.
 */
public class Notification {
    private long notiId;
    private String fromWhoId;
    private String fromWhoName;
    private String toWhoId;
    private String toWhoName;
    private String msg;
    private Date time;
    private int status;

    @Override
    public String toString() {
        return "Notification{" +
                "notiId=" + notiId +
                ", fromWhoId='" + fromWhoId + '\'' +
                ", fromWhoName='" + fromWhoName + '\'' +
                ", toWhoId='" + toWhoId + '\'' +
                ", toWhoName='" + toWhoName + '\'' +
                ", msg='" + msg + '\'' +
                ", time=" + time +
                ", status=" + status +
                '}';
    }

    public long getNotiId() {
        return notiId;
    }

    public void setNotiId(long notiId) {
        this.notiId = notiId;
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
