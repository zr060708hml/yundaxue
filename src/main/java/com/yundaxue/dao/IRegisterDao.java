package com.yundaxue.dao;

public interface IRegisterDao {
	
	/**
	 * ע��
	 * @param username ע��������û���
	 * @param password ע�����������
	 * @return �������ݿ����Ӱ������
	 */
	int register(String username,String password);
	
	/**
	 * ע��ʱ����û����Ƿ��Ѵ���
	 * @param username ����֤�û���
	 * @return ����true���û����Ѵ���, �޷�ע��, ����false������ע��
	 */
	boolean registerCheck(String username);
}
