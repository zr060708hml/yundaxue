package com.yundaxue.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @author zzg,zbx
 *
 */
public class BaseDao {
	
	private String url = "jdbc:mysql://47.105.159.203:3306/yundaxue?useSSL=false";
	private String username = "root";
	private String dbpwd = "Zz806725525**";
	private static Connection conn = null;
	
	private BaseDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, dbpwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		if(conn == null)
			new BaseDao();
		return conn;
	}
	
	public static void closeAll(ResultSet rs ,Statement stat) {
		try {
			if(rs != null)
				rs.close();
			if(stat != null)
				stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
