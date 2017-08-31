package com.core.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.core.common.sqltool.QueryResult;

public interface BaseDao<T> {

	public void save(T entity);

	public void update(T entity);

	public void delete(T entity);

	public void delete(Serializable id);

	public void deleteAll();

	public void batchSave(List<T> list);

	public void batchUpdate(List<T> list);

	public void batchDelete(List<T> list);

	public List<T> findById(Serializable id);

	public List<T> findAll();

	public QueryResult<T> findByPage(Integer pageNo, Integer pageSize);

	public QueryResult<T> findByPage(Integer pageNo, Integer pageSize, T entity);

	public QueryResult<T> findByPage(Integer pageNo, Integer pageSize, Map<String, String> orderby);

	public QueryResult<T> findByPage(Integer pageNo, Integer pageSize, T where,
			Map<String, String> orderby);
	

}
