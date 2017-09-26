package com.sys.user;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sys.entity.user.User;
import com.sys.repository.user.UserRepositoryImp;

public class TestRepository {

	private UserRepositoryImp userRepository;
	
	@Before
	public void initxml() {
		System.out.println("加载配置文件");
		new ClassPathXmlApplicationContext("classpath:application-context.xml");
	}
	
	@Test
	public void testRepository() {
		System.out.println("开始了");
		//User findById = userRepository.findById("37c0c52095164aa4981f4aafd6a83543");
		//System.out.println(findById);
	}
	
}
