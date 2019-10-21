package com.yundaxue.service.impl;

import com.yundaxue.dao.impl.LoginDaoImpl;
import com.yundaxue.pojo.UserInfo;
import com.yundaxue.service.ILoginService;
/**
 * 
 * @author ZZ
 *
 */
public class LoginServiceImpl implements ILoginService {

	public String login(UserInfo ui) {
		
		LoginDaoImpl ldi = new LoginDaoImpl();
		UserInfo ui1 = ldi.login(ui.getUser_name(), ui.getUser_password());
		if(ui1 != null)
			return "µÇÂ¼³É¹¦";
		else
			return "µÇÂ¼Ê§°Ü!!!";
	}

}
