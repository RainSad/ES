package com.sys.controller.index;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.entity.index.ViewComment;
import com.sys.entity.index.ViewImgUrl;
import com.sys.entity.index.ViewShare;
import com.sys.entity.resdata.JSONResponse;
import com.sys.entity.resdata.ViewShareRes;
import com.sys.repository.index.ViewCommentUrlRepositoryImp;
import com.sys.repository.index.ViewImgUrlRepositoryImp;
import com.sys.repository.index.ViewShareRepositoryImp;

/**
 * 
 * @Description: 主页的数据加载类
 * @ClassName: GetData
 * @author 孙文祥
 * @date 2017年10月20日 下午4:55:48
 *
 */
@Controller
public class GetData {
	@Autowired
	private ViewCommentUrlRepositoryImp viewCommentUrlRepositoryImp;
	@Autowired
	private ViewShareRepositoryImp viewShareRepositoryImp;
	@Autowired
	private ViewImgUrlRepositoryImp viewImgUrlRepositoryImp;

	@RequestMapping("index/data/carousel")
	@ResponseBody
	public JSONResponse indexDataCarousel() {

		List<ViewShare> viewShareList = viewShareRepositoryImp.findByType("0");
		List<ViewImgUrl> viewImgUrlList = null;
		List<ViewComment> ViewCommentList = null;
		if (viewShareList.size() > 0) {
			viewImgUrlList = viewImgUrlRepositoryImp.findByid(viewShareList.get(0).getImgUrlId());
		}

		ViewShareRes viewShareRes = new ViewShareRes();
		

		return new JSONResponse(viewShareList == null ? 0 : 1, viewShareList);
	}

}
