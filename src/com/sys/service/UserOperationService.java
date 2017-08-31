package com.sys.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.stereotype.Service;

import com.core.dao.MysqlBaseDaoImp;
import com.sys.entity.user.UserOperation;

@Service
public class UserOperationService extends MysqlBaseDaoImp<UserOperation>{

	@SuppressWarnings("unchecked")
	public UserOperationService() {
		Type superclass = getClass().getGenericSuperclass();
	    ParameterizedType type = (ParameterizedType) superclass;
	    entityClass = (Class<UserOperation>) type.getActualTypeArguments()[0];
	}

	
}
