package entity;

/**
 * Created by Justin on 2017/7/21.
 */
public class SensitiveWord {
    private long sw_id;
    private String name;

    @Override
    public String toString() {
        return "SensitiveWord{" +
                "sw_id=" + sw_id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getSw_id() {
        return sw_id;
    }

    public void setSw_id(long sw_id) {
        this.sw_id = sw_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
