package com.sys.repository.index;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sys.entity.index.ViewShare;

public interface ViewShareRepositoryImp extends CrudRepository<ViewShare,String>, PagingAndSortingRepository<ViewShare, String>, JpaSpecificationExecutor<ViewShare>{
	
	public List<ViewShare> findByType(String type);
	

}
