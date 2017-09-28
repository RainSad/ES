package com.sys.entity.sys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

   /**
    * viewShare 实体类
    * Thu Sep 28 18:34:12 CST 2017 孙文祥
    */ 
@Component
@Entity
@Table(name = "view_share")
public class ViewShare{

	/**分享id*/
	@Id
	@Column(name = "id", length = 32)
	private String id;

	/**分享用户id*/
	@Column(name = "user_id", length = 32)
	private String userId;

	public ViewShare(){
		super();
	}
	public ViewShare(String id, String userId) {
		super();
		this.id = id;
		this.userId = userId;
	}
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
	@Override
	public String toString() {
		return "ViewShare [id=" + id + ", userId=" + userId + "]";
	}
}

