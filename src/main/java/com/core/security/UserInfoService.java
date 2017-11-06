package com.core.security;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

import com.sys.entity.resdata.Result;
import com.sys.entity.sys.SysUser;

public interface UserInfoService extends UserDetailsService {

	/**
	 * 分页条件查询
	 * 
	 * @param queryParam
	 * @param page
	 * @param rows
	 * @return
	 */
	public Result queryUserByParam();

	public Result querySystemUser();

	/**
	 * 验证用户名
	 * 
	 * @param custName
	 * @return
	 */
	public Result validateName();

	/**
	 * 添加新用户
	 * 
	 * @param ccust
	 */
	public Result addUser();

	/**
	 * 添加新用户
	 * 
	 * @param ccust
	 */
	public Result add_User();

	/***
	 * 保存系统用户
	 * 
	 * @param ccust
	 * @return
	 */
	public Result addSystemUser();

	/**
	 * 根据CustId查询用户
	 * 
	 * @param custId
	 * @return
	 */
	public Result getUserById();

	/**
	 * 更新用户信息
	 * 
	 * @param ccust
	 * @return
	 */
	public Result upDateUser();

	/**
	 * 更新用户信息
	 * 
	 * @param ccust
	 * @return
	 */
	public Result upDate_User();

	/**
	 * 更新系统用户
	 */
	public Result upDateSystemUser();

	/**
	 * 删除用户
	 * 
	 * @param ids
	 * @return
	 */
	public Result deleteUser();

	/**
	 * 删除系统用户
	 * 
	 * @param ids
	 * @return
	 */
	public Result deleteSystemUser();

	/**
	 * 查询子用户
	 * 
	 * @param parentId
	 * @param page
	 * @param rows
	 * @return
	 */
	public Result querySubUserByParam();

	/**
	 * 验证密码
	 * 
	 * @param old
	 * @param custId
	 * @return
	 */
	public Result validatePassword();

	/**
	 * 修改用户密码
	 * 
	 * @param newPassword
	 * @param custId
	 */
	public Result updatePassword();

	/**
	 * 统计域内用户在线/离线数量
	 * 
	 * @param regionId
	 * @return
	 */
	public Result countCust();

	/**
	 * 保存子用户Excel导入数据
	 * 
	 * @param params
	 * @return
	 */
	public Result saveUserExcel();

	/**
	 * 用户登录状态
	 * 
	 * @param cust
	 * @param remoteAddr
	 */
	public void userLogin();

	/**
	 * 用户登出状态更新
	 * 
	 * @param cust
	 */
	public void userLoginOut();

	/**
	 * 获取所有子用户
	 * 
	 * @param parentId
	 * @return
	 */
	public List<SysUser> queryAllSubUser();

}
