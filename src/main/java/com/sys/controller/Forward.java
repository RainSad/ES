package com.sys.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.controller.index.Index;

/**
 * 
 * @ClassName: index
 * @Description: (首页的各种操作)
 * @author 孙文祥
 * @date 2017年8月11日 下午5:10:04
 *
 */
@Controller
public class Forward {
	
	 Logger log = Logger.getLogger(Forward.class);

	@RequestMapping("/")
	public String toIndex() {
		 log.debug("请求路径： " + "/");
		 log.debug("返回页面： " + "/WEB-INF/view/index/index.html");
		return "index/index";
	}

	@RequestMapping("toLogin")
	public String toLogin() {

		return "index/login";
	}

	@RequestMapping("toRigister")
	public String toRegister() {

		return "index/register";
	}

	@RequestMapping("toWebSocket")
	public String webSocket() {
		return "index/websockettest";
	}
}
