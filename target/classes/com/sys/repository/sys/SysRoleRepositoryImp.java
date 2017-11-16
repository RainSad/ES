package com.sys.repository.sys;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.sys.entity.sys.SysRole;

public interface SysRoleRepositoryImp extends Repository<SysRole,String>, CrudRepository<SysRole,String>{

	@Query(value = "SELECT " + 
			"sys_role.* " + 
			"FROM " + 
			"sys_user " + 
			"INNER JOIN sys_user_role ON sys_user_role.user_id = sys_user.id " + 
			"INNER JOIN sys_role ON sys_user_role.role_id = sys_role.id " + 
			"WHERE " + 
			"sys_user.id = ?1", nativeQuery = true)
	public List<SysRole> findRoleCode(@Param("roleId")String roleId);

}
