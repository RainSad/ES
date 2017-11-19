package com.sys.repository.index;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sys.entity.index.ViewImgUrl;

public interface ViewImgUrlRepositoryImp extends CrudRepository<ViewImgUrl, String>{

	public List<ViewImgUrl> findByid(String id);

}
