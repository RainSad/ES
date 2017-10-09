package com.sys.entity.index;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 * viewComment 实体类 Mon Oct 09 17:10:13 CST 2017 孙文祥
 */
@Component
@Entity
@Table(name = "view_comment")
public class ViewComment {

	/** 分享id */
	@Id
	@Column(name = "id", length = 32)
	private String id;

	/** 创建时间 */
	@Column(name = "create_time", length = 19)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/** 内容 */
	@Column(name = "message", length = 5000)
	private String message;

	/** 状态，0为显示，1为不现实 */
	@Column(name = "status", length = 2)
	private String status;

	public ViewComment() {
		super();
	}

	public ViewComment(String id, Date createTime, String message, String status) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.message = message;
		this.status = status;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getId() {

		return id;
	}

	public void setCreateTime(Date createTime) {

		this.createTime = createTime;
	}

	public Date getCreateTime() {

		return createTime;
	}

	public void setMessage(String message) {

		this.message = message;
	}

	public String getMessage() {

		return message;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public String getStatus() {

		return status;
	}

	@Override
	public String toString() {
		return "ViewComment [id=" + id + ", createTime=" + createTime + ", message=" + message + ", status=" + status
				+ "]";
	}
}
