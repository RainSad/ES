package com.sys.repository.index;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sys.entity.index.ViewComment;

public interface ViewCommentUrlRepositoryImp extends CrudRepository<ViewComment, String> {

	public List<ViewComment> findByid(String id);
}
