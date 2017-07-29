package entity;

import java.util.Date;

/**
 * Created by Justin on 2017/7/21.
 */
public class Whisper {
    private long whisperId;
    private String senderId;
    private String catcherId;
    private String msg;
    private Date time;

    @Override
    public String toString() {
        return "Whisper{" +
                "whisperId=" + whisperId +
                ", senderId='" + senderId + '\'' +
                ", catcherId='" + catcherId + '\'' +
                ", msg='" + msg + '\'' +
                ", time=" + time +
                '}';
    }

    public long getWhisperId() {
        return whisperId;
    }

    public void setWhisperId(long whisperId) {
        this.whisperId = whisperId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getCatcherId() {
        return catcherId;
    }

    public void setCatcherId(String catcherId) {
        this.catcherId = catcherId;
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
}
