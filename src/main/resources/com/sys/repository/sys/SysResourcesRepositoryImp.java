package com.sys.repository.sys;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.sys.entity.sys.SysResources;

public interface SysResourcesRepositoryImp extends Repository<SysResources,String>, CrudRepository<SysResources,String>{

	@Query(value = "SELECT " + 
			"sys_resources.* " + 
			"FROM " + 
			"sys_role_resources " + 
			"INNER JOIN sys_resources ON sys_role_resources.resources_id = sys_resources.id " + 
			"WHERE sys_role_resources.role_id=?1", nativeQuery = true)
	public List<SysResources> findRole(@Param("roleId")String roleId);
}
