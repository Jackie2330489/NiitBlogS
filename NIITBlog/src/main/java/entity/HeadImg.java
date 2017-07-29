package entity;

/**
 * Created by Justin on 2017/7/23.
 */
public class HeadImg {
    private String studentId;
    private String bigPath;
    private String smallPath;

    @Override
    public String toString() {
        return "HeadImg{" +
                "studentId='" + studentId + '\'' +
                ", bigPath='" + bigPath + '\'' +
                ", smallPath='" + smallPath + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBigPath() {
        return bigPath;
    }

    public void setBigPath(String bigPath) {
        this.bigPath = bigPath;
    }

    public String getSmallPath() {
        return smallPath;
    }

    public void setSmallPath(String smallPath) {
        this.smallPath = smallPath;
    }
}
