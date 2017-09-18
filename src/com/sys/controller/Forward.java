package com.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("/")
	public String toIndex() {
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
