package hdgc.bean;

import java.util.Date;

public class GroupPower {
    private Long id;

    private Long powerId;

    private Long groupId;

    private Boolean isactived;

    private Date inserttime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Boolean getIsactived() {
        return isactived;
    }

    public void setIsactived(Boolean isactived) {
        this.isactived = isactived;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
}