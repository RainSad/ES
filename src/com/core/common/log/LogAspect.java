package com.core.common.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sys.entity.user.UserLog;
import com.sys.service.user.UserLogService;

/**
 * 
 * @ClassName: LogAspect
 * @Description: 日志类，写入登陆信息到数据库，控制台打出信息
 * @author 孙文祥
 * @date 2017年8月13日 下午4:28:23
 *
 */
@Aspect
@Component
public class LogAspect {

	@Autowired
	private UserLogService userLogService;
	@Autowired
	private UserLog userLog;

	public LogAspect() {
	}

	// @Pointcut("execution(* com.core.dao.MysqlBaseDaoImp.*(..))")
	// public void daoAspect() {
	//
	// }

	// @Before("daoAspect()")
	// public void daoDeforeShow(JoinPoint jp) {
	// System.out.println("=================dao---" + jp.getSignature().getName());
	// }

	@Pointcut("execution(* com.sys.controller..*.*(..))")
	public void controllerAspect() {

	}

	@Before("controllerAspect()")
	public void controllerBeforeShow(JoinPoint jp) {
		System.out.println("--");
	}
}
