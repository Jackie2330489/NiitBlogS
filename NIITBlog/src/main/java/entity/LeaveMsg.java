package entity;

/**
 * Created by Justin on 2017/7/21.
 */
public class LeaveMsg {
    private long lmId;
    private String pageOwnerId;
    private String fromWhoId;
    private String fromWhoName;
    private String toWhoId;
    private String toWhoName;
    private String msg;
    private String time;

    @Override
    public String toString() {
        return "LeaveMsg{" +
                "lmId=" + lmId +
                ", pageOwnerId='" + pageOwnerId + '\'' +
                ", fromWhoId='" + fromWhoId + '\'' +
                ", fromWhoName='" + fromWhoName + '\'' +
                ", toWhoId='" + toWhoId + '\'' +
                ", toWhoName='" + toWhoName + '\'' +
                ", msg='" + msg + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public long getLmId() {
        return lmId;
    }

    public void setLmId(long lmId) {
        this.lmId = lmId;
    }

    public String getPageOwnerId() {
        return pageOwnerId;
    }

    public void setPageOwnerId(String pageOwnerId) {
        this.pageOwnerId = pageOwnerId;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
