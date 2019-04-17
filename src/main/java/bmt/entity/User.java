package bmt.entity;

/**
* Title: User  
* Description:角色实体类
* @author Dalphist  
* @date 2019年2月11日
 */
public class User {
    private String id;
    private String loginName;	//登陆帐号
    private String username;	//用户昵称
    private String password;
    private String roleId;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
    
}
