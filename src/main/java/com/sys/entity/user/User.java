package com.sys.entity.user;

import org.springframework.stereotype.Component;


@Component
public class User{

	/** 
	* @Fields serialVersionUID : TODO(用户登录实体) 
	*/ 
	private String id;
	private String userName;
	private String passWord;
	private String nickName;
	
	
	public User() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", nickName=" + nickName + "]";
	}
	
}
