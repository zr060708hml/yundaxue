package com.yundaxue.util.selectpojo;

import java.sql.Timestamp;

/**
 * ����չʾ��ʵ���࣬���û���������id�����Ա��⣬����ʱ�䣬�������ͣ�������ʹ�ã�
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
