package com.yundaxue.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yundaxue.dao.BaseDao;
import com.yundaxue.dao.ILoginDao;
import com.yundaxue.pojo.UserInfo;
/**
 * 
 * @author ZZ
 *
 */
public class LoginDaoImpl implements ILoginDao {

	public UserInfo login(String username, String password) {
		UserInfo ui = null;
		String sql = "SELECT major_info.major_name,user_info.user_id,user_info.user_name,user_info.user_password,user_info.user_avatar,user_info.user_gender_id,user_info.user_age,user_info.user_nickname,user_info.user_class,user_info.user_type_id,user_info.id_card,user_info.user_score,college_info.college_name FROM user_info INNER JOIN major_info ON user_info.user_major_id = major_info.user_major_id INNER JOIN college_info ON major_info.college_id = college_info.college_id WHERE user_info.user_name = ? AND user_info.user_password = ?";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setString(1, username);
			pstat.setString(2, password);
			rs = pstat.executeQuery();
			if(rs.next()){
				ui = new UserInfo();
				ui.setUser_id(rs.getInt("user_id"));
				ui.setUser_age(rs.getInt("user_age"));
				ui.setUser_name(rs.getString("user_name"));
				ui.setUser_password(rs.getString("user_password"));
				ui.setUser_score(rs.getInt("user_score"));
				ui.setUser_avatar(rs.getString("user_avatar"));
				ui.setUser_class(rs.getInt("user_class"));
				ui.setUser_gender_id(rs.getInt("user_gender_id"));
				ui.setUser_major_id(rs.getString("major_name"));
				ui.setUser_type_id(rs.getInt("user_type_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ui;
	}
}
