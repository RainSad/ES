package com.core.security;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sys.entity.resdata.Result;
import com.sys.entity.sys.SysUser;

public class UserInfoServiceImp implements UserInfoService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result queryUserByParam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result querySystemUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result validateName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result addUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add_User() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result addSystemUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result upDateUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result upDate_User() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result upDateSystemUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteSystemUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result querySubUserByParam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result validatePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result updatePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result countCust() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result saveUserExcel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLoginOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SysUser> queryAllSubUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
