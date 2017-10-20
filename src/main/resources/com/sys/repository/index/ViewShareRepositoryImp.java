package com.sys.repository.index;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sys.entity.index.ViewShare;

public interface ViewShareRepositoryImp extends CrudRepository<ViewShare,String>{
	
	public List<ViewShare> findByType(String type);
	

}
