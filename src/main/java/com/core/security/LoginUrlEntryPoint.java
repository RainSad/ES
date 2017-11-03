package com.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class LoginUrlEntryPoint implements AuthenticationEntryPoint{

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException arg2) throws IOException, ServletException {
		String targetUrl = null;
		String url = request.getRequestURI();

		if (url.indexOf("admin") > 0)
		{
			targetUrl = "/admin/login.do";
		}
		else if( url.indexOf("ivcs")>0){
			targetUrl = "/ivcs/login.do";	
		}
		else
		{
			targetUrl = "/login.do";
		}
		targetUrl = request.getContextPath() + targetUrl;
		response.sendRedirect(targetUrl);
		
	}

}
