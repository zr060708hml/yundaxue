package com.yundaxue.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.yundaxue.dao.BaseDao;
import com.yundaxue.dao.IRegisterDao;

public class RegisterDaoImpl implements IRegisterDao {

	public int register(String username, String password) {
		String sql = "insert into user_info (user_id, user_name, user_password, user_gender_id, user_type_id) values (?, ?, ?, ?, ?)";
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		int count = -1;
		try{
			conn.setAutoCommit(false);
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, 0);
			pstat.setString(2, username);
			pstat.setString(3, password);
			pstat.setInt(4, 3);
			pstat.setInt(5, 1);
			count = pstat.executeUpdate();
			conn.commit();
		}catch (SQLException a){
			a.printStackTrace();
		}finally{
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}

	public boolean registerCheck(String username) {
		String sql = "select user_name from user_info where user_name = ?";
		PreparedStatement pstat = null;
		boolean r = true;
		try{
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setString(1, username);
			r = pstat.execute();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(null, pstat);
		}
		return r;
	}

}
