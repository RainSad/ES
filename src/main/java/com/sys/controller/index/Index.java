package com.sys.controller.index;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sys.entity.resdata.JSONResponse;
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
            @RequestParam(value = "passWord", defaultValue = "") String passWord, ModelMap data, HttpServletRequest request, ModelMap model) {

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

    /**
     * 
     * @Description: 图片上传
     * @Title: indexUploadImg 
     * @param @param img 
     * @param @param request 
     * @param @return 
     * @param @throws IllegalStateException 
     * @param @throws
     * IOException    设定文件 
     * @return Map<String,Object>    返回上传后的文件名称并返回到前台
     *  @throws
     */
    @RequestMapping("index/upload/img")
    @ResponseBody
    public Map<String, Object> indexUploadImg(MultipartFile img, @RequestParam(value = "id") String id, HttpServletRequest request)
            throws IllegalStateException, IOException {

        log.debug(id + "--------------" + img.getSize());
        // 上传图片
        Map<String, Object> uploadImg = viewShareService.uploadImg(img);
        return uploadImg;
    }

    /**
     * 
     * @Description:上传分享内容 
     * @Title: indexUploadMessage 
     * @param @param titleInput 
     * @param @param messageDetail 
     * @param @return    设定文件 
     * @return String    返回类型 
     * @throws
     */
    @RequestMapping("index/upload/message")
    @ResponseBody
    public String indexUploadMessage(@RequestParam(value = "id") String id, @RequestParam(value = "titleInput") String titleInput,
            @RequestParam(value = "messageDetail") String messageDetail) {

    	log.debug("请求路径： " + "index/upload/getId");
        log.debug(id + "----------" + titleInput + "----" + messageDetail);
        return null;
    }

    /**
     * 
    * @Description: 得到唯一id
    * @Title: getIndexUploadId 
    * @param @return    设定文件 
    * @return string    返回类型 
    * @throws
     */
    @RequestMapping("index/upload/getId")
    @ResponseBody
    public JSONResponse getIndexUploadGetId() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", viewShareService.getID());
        log.debug("请求路径： " + "index/upload/getId");
        return new JSONResponse(map.size() > 0 ? 1 : 0, map, map.size());
    }

}
