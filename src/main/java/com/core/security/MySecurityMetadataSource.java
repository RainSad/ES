package com.core.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sys.entity.sys.SysResources;

@Service("mySecurityMetadataSource")
public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
	// 由spring调用
	Logger log = Logger.getLogger(MySecurityMetadataSource.class);
	@Resource
	private SecurityTestInterface dao;
	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

	/*
	 * public MySecurityMetadataSource() {
	 * 
	 * loadResourceDefine(); }
	 */

	public Collection<ConfigAttribute> getAllConfigAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}

	// 载入全部资源与权限的关系
	private void loadResourceDefine() {
		if (resourceMap == null) {
			resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
			/*
			 * List<String> resources ; resources =
			 * Lists.newArrayList("/jsp/user.do","/jsp/getoutput.do");
			 */
			List<SysResources> findResources = dao.findResource();

			for (SysResources url_resource : findResources) {
				Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
				ConfigAttribute configAttribute = new SecurityConfig(url_resource.getRole_Name());
				for (String resource : url_resource.getRole_url()) {
					configAttributes.add(configAttribute);
					resourceMap.put(resource, configAttributes);
				}

			}
			// 以权限名封装为Spring的security Object

		}
		Gson gson = new Gson();
		log.info("权限资源相应关系：" + gson.toJson(resourceMap));

		Set<Entry<String, Collection<ConfigAttribute>>> resourceSet = resourceMap.entrySet();
		Iterator<Entry<String, Collection<ConfigAttribute>>> iterator = resourceSet.iterator();

	}

	// 返回所请求资源所须要的权限
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {

		String requestUrl = ((FilterInvocation) object).getRequestUrl();
		log.info("requestUrl is " + requestUrl);
		if (resourceMap == null) {
			loadResourceDefine();
		}
		log.info("通过资源定位到的权限：" + resourceMap.get(requestUrl));
		return resourceMap.get(requestUrl);
	}

}