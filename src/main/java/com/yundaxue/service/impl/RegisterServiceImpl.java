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
				return "ע��ɹ���";
			}else{
				return "ע��ʧ��, �����ԣ�";
			}
		}else{
			return "�û����Ѵ��ڣ������³��ԣ�";
		}
	}
}
