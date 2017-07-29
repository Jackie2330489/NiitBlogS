package entity;

import java.util.Date;

/**
 * Created by Justin on 2017/7/21.
 */
public class Draft {
    private long draftId;
    private String studentId;
    private String title;
    private String draft;
    private Date time;

    @Override
    public String toString() {
        return "Draft{" +
                "draftId=" + draftId +
                ", studentId='" + studentId + '\'' +
                ", title='" + title + '\'' +
                ", draft='" + draft + '\'' +
                ", time=" + time +
                '}';
    }

    public long getDraftId() {
        return draftId;
    }

    public void setDraftId(long draftId) {
        this.draftId = draftId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
