package com.sys.entity.user;

import org.springframework.stereotype.Component;

/**
 * user_operation 实体类 Sun Aug 13 16:13:07 CST 2017 孙文祥
 */

@Component
public class UserOperation {
	private String id;
	private String controllerMethod;
	private String clickTime;

	public UserOperation() {
		super();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setControllerMethod(String controllerMethod) {
		this.controllerMethod = controllerMethod;
	}

	public String getControllerMethod() {
		return controllerMethod;
	}

	public void setClickTime(String clickTime) {
		this.clickTime = clickTime;
	}

	public String getClickTime() {
		return clickTime;
	}

	@Override
	public String toString() {
		return "UserOperation [id=" + id + ", controllerMethod=" + controllerMethod + ", clickTime=" + clickTime + "]";
	}
	
}
