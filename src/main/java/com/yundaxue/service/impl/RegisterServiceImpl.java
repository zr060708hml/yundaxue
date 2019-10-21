package com.yundaxue.service.impl;

import com.yundaxue.dao.impl.RegisterDaoImpl;
import com.yundaxue.service.IRegisterService;

public class RegisterServiceImpl implements IRegisterService {

	public String register(String username, String password) {
		RegisterDaoImpl rdi = new RegisterDaoImpl();
		boolean r = rdi.registerCheck(username);
		if(!r){
			int resultCount = rdi.register(username, password);
			if(resultCount > 0 ){
				return "注册成功！";
			}else{
				return "注册失败, 请重试！";
			}
		}else{
			return "用户名已存在，请重新尝试！";
		}
	}
}
