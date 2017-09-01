package com.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sys.entity.user.User;
import com.sys.entity.user.UserInfo;
import com.sys.service.UserInfoService;
import com.sys.service.UserService;

/**
 * 
 * @ClassName: index
 * @Description: TODO(首页的各种操作)
 * @author 孙文祥
 * @date 2017年8月11日 下午5:10:04
 *
 */
@Controller
public class Index {

	// @Autowired
	// private BaseDaoImp baseDaoImp;

	@Autowired
	private UserService userService;
	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private User user;
	@Autowired
	private UserInfo userInfo;

	
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

	@RequestMapping("login.shtml")
	public String login(@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "passWord", defaultValue = "") String passWord, ModelMap data,
			HttpServletRequest request, ModelMap model) {

		user.setUserName(userName);
		
		//=================================
		List<UserInfo> info = userInfoService.findById("37c0c52095164aa4981f4aafd6a8354b");
		HttpSession session = request.getSession(true);
		session.setAttribute("userInfo", info.get(0));
		
		//===================================
		

	/*	QueryResult<User> findByPage = userService.findByPage(-1, -1, user);// pageNo和pageSize都为-1得时候不分页
		if (findByPage.getTotalRow() > 0 && findByPage != null) {
			if (findByPage.getData().get(0).getPassWord().equals(passWord)) {
				List<UserInfo> info = userInfoService.findById(findByPage.getData().get(0).getId());
				if(info.size() > 0) {
//System.out.println(ip);
					HttpSession session = request.getSession(true);
					session.setAttribute("userInfo", info.get(0));
					model.addAttribute("userInfo", JSON.toJSONString(info));
					return "index";
				}
			} else {
				model.addAttribute("error", "密码错误");
				return "login";
			}
		}*/
		model.addAttribute("error", "无此用户");
		return "login";

	}
}
