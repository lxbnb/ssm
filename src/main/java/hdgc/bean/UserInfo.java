package hdgc.bean;

import java.io.Serializable;

public class UserInfo implements Serializable{

	private static final long serialVersionUID = 914918926557877403L;

	private Long id;

    private String name;

    private String idcard;

    private String sex;

    private String birthday;

    private String countycode;

    private String nativeplace;

    private String nation;

    private String idcardImg;

    private Long alluserId;

    private Boolean ischecked;
    
    private Alluser alluser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getCountycode() {
        return countycode;
    }

    public void setCountycode(String countycode) {
        this.countycode = countycode == null ? null : countycode.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getIdcardImg() {
        return idcardImg;
    }

    public void setIdcardImg(String idcardImg) {
        this.idcardImg = idcardImg == null ? null : idcardImg.trim();
    }

    public Long getAlluserId() {
        return alluserId;
    }

    public void setAlluserId(Long alluserId) {
        this.alluserId = alluserId;
    }

    public Boolean getIschecked() {
        return ischecked;
    }

    public void setIschecked(Boolean ischecked) {
        this.ischecked = ischecked;
    }

	public Alluser getAlluser() {
		return alluser;
	}

	public void setAlluser(Alluser alluser) {
		this.alluser = alluser;
	}
    
    
}