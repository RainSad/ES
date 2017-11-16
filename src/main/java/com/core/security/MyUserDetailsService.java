package com.core.security;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.core.common.utill.EmptyUtils;
import com.sys.entity.sys.SysRole;
import com.sys.entity.sys.SysUser;
import com.sys.repository.sys.SysRoleRepositoryImp;
import com.sys.repository.sys.SysUserRepositoryImp;

public class MyUserDetailsService implements UserDetailsService {
	Logger log = Logger.getLogger(MyUserDetailsService.class);
	
	@Autowired
	private SysUserRepositoryImp sysUserRepositoryImp;
	@Autowired
	private SysRoleRepositoryImp sysRoleRepositoryImp;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser user = new SysUser();
		user = sysUserRepositoryImp.findOne(username);
		List<GrantedAuthority> gList = new ArrayList<GrantedAuthority>();
		if(EmptyUtils.isNotEmpty(user)) {
			List<SysRole> findRoleCode = sysRoleRepositoryImp.findRoleCode(user.getId());
			if(EmptyUtils.isNotEmpty(findRoleCode)) {
				for(SysRole temp : findRoleCode) {
					gList.add(new SimpleGrantedAuthority(temp.getRoleCode()));
				}
			}
		}
		user.setGrantedAuthorityList(gList);
		
		return user;
		
	}

}
