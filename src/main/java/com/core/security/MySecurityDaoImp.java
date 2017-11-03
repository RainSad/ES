package com.core.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.sys.entity.sys.SysResources;
import com.sys.entity.sys.SysRole;
import com.sys.entity.sys.SysUser;
import com.sys.repository.sys.SysResourcesRepositoryImp;
import com.sys.repository.sys.SysRoleRepositoryImp;
import com.sys.repository.sys.SysUserRepositoryImp;

@Repository("MySecurityDaoImp")
public class MySecurityDaoImp {
	Logger log = Logger.getLogger(MySecurityDaoImp.class);

	@Autowired
	private SysUserRepositoryImp sysUserRepositoryImp;

	@Autowired
	private SysResourcesRepositoryImp sysResourcesRepositoryImp;

	@Autowired
	private SysRoleRepositoryImp sysRoleRepositoryImp;


	public boolean getinput() {
		log.debug("getinput");
		return true;
	}

	public boolean geoutput() {
		log.debug("geoutput");
		return true;
	}

	public boolean addreport_admin() {
		log.debug("addreport_admin");
		return true;
	}

	public boolean deletereport_admin() {
		log.debug("deletereport_admin");
		return true;
	}

	public SysUser findbyUsername(String name) {
		SysUser users = new SysUser();
		users = sysUserRepositoryImp.findOne(name);
		log.debug(users.getUsername() + "    " + users.getPassword());
		return users;
	}

	public void user_login() {
		log.debug("拥有ROLE_USER权限的方法訪问：user_login");

	}

	public Map<String, List<SysResources>> findResource() {
		// 存储角色与资源的对应关系
		Map<String, List<SysResources>> roletypes = new HashMap<String, List<SysResources>>();
		// 存储角色名称列表
		List<String> roleNames = new ArrayList<String>();
		// 存储角色查询结果
		List<SysRole> listRole = (List<SysRole>) sysRoleRepositoryImp.findAll();

		// 循环存储查询结果,存储角色与对应的资源url
		for (SysRole temp : listRole) {
			roleNames.add(temp.getRoleCode());
			List<SysResources> urlResourceTemp = sysResourcesRepositoryImp.findRole(temp.getId());
			roletypes.put(temp.getRoleCode(), urlResourceTemp);
		}
		log.debug("权限资源相应关系:" + JSON.toJSONString(roletypes));
		return roletypes;
	}

}
