package com.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.core.common.canstant.Canstant;
import com.core.common.utill.EmptyUtils;

public class LoginUrlEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException arg2)
			throws IOException, ServletException {
		String targetUrl = null;
		String url = request.getRequestURI();

		SysUserSecurity user = (SysUserSecurity) request.getSession().getAttribute(Canstant.USER_INFO);
		// System.out.println(user.getUsername());
		if (EmptyUtils.isEmpty(user)) {
			targetUrl = "/toLogin";
		} else if (url.indexOf("admin") > 0) {
			targetUrl = "/admin/login";
		} else if (url.indexOf("ivcs") > 0) {
			targetUrl = "/ivcs/login";
		} else {
			targetUrl = "/login";
		}
		targetUrl = request.getContextPath() + targetUrl;
		response.sendRedirect(targetUrl);

	}

}
