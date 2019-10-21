package com.yundaxue.util.selectpojo;

import java.sql.Timestamp;

/**
 * 留言展示的实体类，有用户名，留言id，留言标题，创建时间，留言类型（供分类使用）
 * @author zbx
 *
 * */
public class SelectAllMessages {
	private String user_name;
	private Integer message_id;
	private String message_title;
	private Timestamp message_creatime;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	public String getMessage_title() {
		return message_title;
	}
	public void setMessage_title(String message_title) {
		this.message_title = message_title;
	}
	public Timestamp getMessage_creatime() {
		return message_creatime;
	}
	public void setMessage_creatime(Timestamp message_creatime) {
		this.message_creatime = message_creatime;
	}
}
