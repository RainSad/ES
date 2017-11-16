package com.sys.repository.sys;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import com.sys.entity.sys.SysUser;

public interface SysUserRepositoryImp extends Repository<SysUser,String>, CrudRepository<SysUser,String>{

}
