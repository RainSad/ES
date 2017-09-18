package com.sys.service.user;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.stereotype.Service;

import com.core.dao.MysqlBaseDaoImp;
import com.sys.entity.user.UserLog;

@Service
public class UserLogService extends MysqlBaseDaoImp<UserLog>{

	@SuppressWarnings("unchecked")
	public UserLogService() {
		Type superclass = getClass().getGenericSuperclass();
	    ParameterizedType type = (ParameterizedType) superclass;
	    entityClass = (Class<UserLog>) type.getActualTypeArguments()[0];
	}

	
}
