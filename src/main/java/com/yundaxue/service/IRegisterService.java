package com.yundaxue.service;

public interface IRegisterService {
	
	/**
	 * 注册service层
	 * @param username 传入的用户名
	 * @param password 传入的密码
	 * @return 返回注册结果
	 */
	String register(String username, String password);
}
