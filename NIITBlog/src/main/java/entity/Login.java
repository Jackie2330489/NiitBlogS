package entity;

/**
 * Created by Justin on 2017/7/27.
 */
public class Login {
    private String loginId;
    private String studentId;

    public Login(String loginId, String studentId) {
        this.loginId = loginId;
        this.studentId = studentId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
