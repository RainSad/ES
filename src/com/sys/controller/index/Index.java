package com.sys.controller.index;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.core.common.sqltool.IdToolUtil;
import com.sys.controller.log.LogLogin;
import com.sys.entity.user.User;
import com.sys.entity.user.UserInfo;
import com.sys.service.index.ViewShareService;
import com.sys.service.user.UserInfoService;
import com.sys.service.user.UserService;

/**
 * 
 * @Description: 分发都在这里
 * @ClassName: Index
 * @author 孙文祥
 * @date 2017年9月18日 上午8:39:13
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
	@Autowired
	private ViewShareService viewShareService;

	Logger log = Logger.getLogger(Index.class);

	@RequestMapping("index/login")
	public String login(@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "passWord", defaultValue = "") String passWord, ModelMap data,
			HttpServletRequest request, ModelMap model) {

		user.setUserName(userName);

		// =================================
		List<UserInfo> info = userInfoService.findById("37c0c52095164aa4981f4aafd6a8354b");
		HttpSession session = request.getSession(true);
		session.setAttribute("userInfo", info.get(0));

		// ===================================

		/*
		 * QueryResult<User> findByPage = userService.findByPage(-1, -1, user);//
		 * pageNo和pageSize都为-1得时候不分页 if (findByPage.getTotalRow() > 0 && findByPage !=
		 * null) { if (findByPage.getData().get(0).getPassWord().equals(passWord)) {
		 * List<UserInfo> info =
		 * userInfoService.findById(findByPage.getData().get(0).getId()); if(info.size()
		 * > 0) { //System.out.println(ip); HttpSession session =
		 * request.getSession(true); session.setAttribute("userInfo", info.get(0));
		 * model.addAttribute("userInfo", JSON.toJSONString(info)); return "index"; } }
		 * else { model.addAttribute("error", "密码错误"); return "login"; } }
		 */
		model.addAttribute("error", "无此用户");
		return "login";

	}

	@RequestMapping("index/upload/img")
	@ResponseBody
	public Map<String, Object> indexUploadImg(MultipartFile img, HttpServletRequest request)
			throws IllegalStateException, IOException {

		//上传图片
		Map<String, Object> uploadImg = viewShareService.uploadImg(img);
		return uploadImg;
	}

}
