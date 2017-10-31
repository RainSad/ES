package com.sys.controller.index;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
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
import com.sys.service.index.IndexService;

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
	

	/**
	 * 获取主页轮播图
	* @Description: 
	* @Title: indexDataCarousel 
	* @param @return    设定文件 
	* @return Page<ViewShare>    返回类型 
	* @throws
	 */
	@RequestMapping("index/data/carousel")
	@ResponseBody
	public Page<ViewShare> indexDataCarousel() {

		 Sort sort = new Sort(Direction.DESC, "creatTime");
		 Pageable pageable = new PageRequest(0, 3);
		 
		 //viewShareRepositoryImp.findAll(new Specification<ViewShare>((root,query,cb) -> {}), pageable);
		return null;
	}

}
