package com.core.common.sqltool;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: QueryResult
 * @Description: TODO(记录结果集)
 * @author 孙文祥
 * @date 2017年8月12日 下午3:06:18
 * 
 * @param <T>
 */
@Component
public class QueryResult<T> {

	private List<T> data; // 结果集
	private int totalRow; // 总记录数
	private int CurrentPageNo;
	private int CurrentPageSize;

	public QueryResult() {
	}

	public QueryResult(List<T> data, int totalRow, int currentPageNo, int currentPageSize) {
		this.data = data;
		this.totalRow = totalRow;
		this.CurrentPageNo = currentPageNo;
		this.CurrentPageSize = currentPageSize;
	}

	public QueryResult(List<T> data) {
		this.data = data;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	public int getCurrentPageNo() {
		return CurrentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		CurrentPageNo = currentPageNo;
	}

	public int getCurrentPageSize() {
		return CurrentPageSize;
	}

	public void setCurrentPageSize(int currentPageSize) {
		CurrentPageSize = currentPageSize;
	}

}
