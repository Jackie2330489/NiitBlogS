package dto;

/**
 * Created by Justin on 2017/7/19.
 */
public class NiitBlogResult<T> {
    //返回JSON的返回类型
    private boolean success;
    private T data;
    private String msg;

    public NiitBlogResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public NiitBlogResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
