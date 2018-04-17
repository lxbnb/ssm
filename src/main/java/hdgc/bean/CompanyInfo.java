package hdgc.bean;

public class CompanyInfo {
    private Long id;

    private String comName;

    private String comPhone;

    private String comHaver;

    private String comAddress;

    private Long alluserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public String getComPhone() {
        return comPhone;
    }

    public void setComPhone(String comPhone) {
        this.comPhone = comPhone == null ? null : comPhone.trim();
    }

    public String getComHaver() {
        return comHaver;
    }

    public void setComHaver(String comHaver) {
        this.comHaver = comHaver == null ? null : comHaver.trim();
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress == null ? null : comAddress.trim();
    }

    public Long getAlluserId() {
        return alluserId;
    }

    public void setAlluserId(Long alluserId) {
        this.alluserId = alluserId;
    }
}