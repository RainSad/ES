package com.sys.service.user;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.stereotype.Service;

import com.core.dao.MysqlBaseDaoImp;
import com.sys.entity.user.User;

@Service
public class UserService extends MysqlBaseDaoImp<User>{

	@SuppressWarnings("unchecked")
	public UserService() {
		Type superclass = getClass().getGenericSuperclass();
	    ParameterizedType type = (ParameterizedType) superclass;
	    entityClass = (Class<User>) type.getActualTypeArguments()[0];
	}

	
}
