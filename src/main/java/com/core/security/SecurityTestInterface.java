package com.core.security;

import java.util.List;

import com.sys.entity.sys.SysResources;
import com.sys.entity.sys.SysUser;

public interface SecurityTestInterface {

	boolean getinput();

	boolean geoutput();
	//@RolesAllowed("ROLE_ADMIN")//拥有ROLE_ADMIN权限的用户才可进入此方法
	boolean addreport_admin();
	//@RolesAllowed("ROLE_ADMIN")
	boolean deletereport_admin();
	
	SysUser findbyUsername(String name);
	//@RolesAllowed("ROLE_USER")
	void user_login();

	List<SysResources> findResource();

}
