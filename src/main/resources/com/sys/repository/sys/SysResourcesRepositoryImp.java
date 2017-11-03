package com.sys.repository.sys;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.sys.entity.sys.SysResources;

public interface SysResourcesRepositoryImp extends Repository<SysResources,String>, CrudRepository<SysResources,String>{

	@Query(value = "SELECT " + 
			"SysResources.* " + 
			"FROM " + 
			"SysRoleResources " + 
			"INNER JOIN SysResources ON SysRoleResources.resources_id = SysResources.id " + 
			"WHERE SysRoleResources.role_id=?1", nativeQuery = true)
	public List<SysResources> findRole(@Param("roleId")String roleId);
}
