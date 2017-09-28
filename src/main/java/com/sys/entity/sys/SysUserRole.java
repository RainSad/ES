package com.sys.entity.sys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

   /**
    * sysUserRole 实体类
    * Thu Sep 28 18:34:12 CST 2017 孙文祥
    */ 
@Component
@Entity
@Table(name = "sys_user_role")
public class SysUserRole{

	/**分享用户id*/
	@Id
	@Column(name = "user_id", length = 32)
	private String userId;

	/***/
	@Column(name = "role_id", length = 32)
	private String roleId;

	public SysUserRole(){
		super();
	}
	public SysUserRole(String userId, String roleId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
	}
	public void setUserId(String userId){

		this.userId=userId;
	}

	public String getUserId(){

		return userId;
	}

	public void setRoleId(String roleId){

		this.roleId=roleId;
	}

	public String getRoleId(){

		return roleId;
	}
	@Override
	public String toString() {
		return "SysUserRole [userId=" + userId + ", roleId=" + roleId + "]";
	}
}

