package hdgc.bean;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

public class Alluser implements Serializable{

	private static final long serialVersionUID = 8282240374275877146L;

	private Long id;
    
    private Boolean isdeleted = false;
    @Pattern(regexp = "(^[a-zA-Z][a-zA-Z0-9_]{5,15}$)|(^[\u2E80-\u9FFF]{2,5})",
    		message="用户名必须是2-5位中文或英文开头的6-16位字母数字下划线的组合")
    private String username;
    @Pattern(regexp = "^[a-zA-Z0-9_-]{6,16}$",message="密码必须是6至16位字母数字下划线连接线的组合")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	@Override
	public String toString() {
		return "Alluser [id=" + id + ", isdeleted=" + isdeleted + ", username=" + username + ", password=" + password
				+ "]";
	}
    
}