package com.sys.entity.index;

   /**
    * view_share 实体类
    * Mon Sep 18 17:25:46 CST 2017 孙文祥
    */ 


public class ViewShare{
	private String id;
	private String userId;
	public void setId(String id){
	this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setUserId(String userId){
	this.userId=userId;
	}
	public String getUserId(){
		return userId;
	}
}

