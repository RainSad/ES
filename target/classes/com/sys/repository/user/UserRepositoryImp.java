package com.sys.repository.user;

import org.springframework.data.repository.CrudRepository;

import com.sys.entity.user.User;

public interface UserRepositoryImp extends CrudRepository<User, String>{

}
