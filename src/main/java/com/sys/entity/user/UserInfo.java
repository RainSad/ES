package com.sys.entity.user;

import org.springframework.stereotype.Component;

/**
 * user_info 实体类 Sun Aug 13 16:03:31 CST 2017 孙文祥
 */

@Component
public class UserInfo {
	private String id;
	private String nickName;
	private String sex;
	private String birthday;
	private String qq;
	private String wechat;
	private String weibo;
	private String score;
	private String regTime;
	private String status;
	private String discription;
	private String regIp;
	private String userName;

	public UserInfo() {
		super();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getQq() {
		return qq;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScore() {
		return score;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getDiscription() {
		return discription;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public String getRegIp() {
		return regIp;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", nickName=" + nickName + ", sex=" + sex + ", birthday=" + birthday + ", qq="
				+ qq + ", wechat=" + wechat + ", weibo=" + weibo + ", score=" + score + ", regTime=" + regTime
				+ ", status=" + status + ", discription=" + discription + ", regIp=" + regIp + ", userName=" + userName
				+ "]";
	}

}
