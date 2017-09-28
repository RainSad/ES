package com.sys.entity.sys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

   /**
    * sysRoleResources 实体类
    * Thu Sep 28 18:34:11 CST 2017 孙文祥
    */ 
@Component
@Entity
@Table(name = "sys_role_resources")
public class SysRoleResources{

	/***/
	@Id
	@Column(name = "role_id", length = 32)
	private String roleId;

	/***/
	@Column(name = "resources_id", length = 32)
	private String resourcesId;

	public SysRoleResources(){
		super();
	}
	public SysRoleResources(String roleId, String resourcesId) {
		super();
		this.roleId = roleId;
		this.resourcesId = resourcesId;
	}
	public void setRoleId(String roleId){

		this.roleId=roleId;
	}

	public String getRoleId(){

		return roleId;
	}

	public void setResourcesId(String resourcesId){

		this.resourcesId=resourcesId;
	}

	public String getResourcesId(){

		return resourcesId;
	}
	@Override
	public String toString() {
		return "SysRoleResources [roleId=" + roleId + ", resourcesId=" + resourcesId + "]";
	}
}

