package entity;

/**
 * Created by Justin on 2017/7/20.
 */
public class Tag {
    private long tarticleId;
    private String tagName;

    @Override
    public String toString() {
        return "Tag{" +
                "tarticleId=" + tarticleId +
                ", tagName='" + tagName + '\'' +
                '}';
    }

    public long getTarticleId() {
        return tarticleId;
    }

    public void setTarticleId(long tarticleId) {
        this.tarticleId = tarticleId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
