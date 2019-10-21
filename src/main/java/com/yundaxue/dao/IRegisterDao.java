package com.yundaxue.dao;

public interface IRegisterDao {
	
	/**
	 * 注册
	 * @param username 注册输入的用户名
	 * @param password 注册输入的密码
	 * @return 返回数据库的受影响行数
	 */
	int register(String username,String password);
	
	/**
	 * 注册时检查用户名是否已存在
	 * @param username 待验证用户名
	 * @return 返回true，用户名已存在, 无法注册, 返回false，可以注册
	 */
	boolean registerCheck(String username);
}
