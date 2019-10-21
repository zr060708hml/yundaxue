package com.yundaxue.dao;

import com.yundaxue.pojo.UserInfo;

public interface ILoginDao {
	UserInfo login(String username,String password);
}
