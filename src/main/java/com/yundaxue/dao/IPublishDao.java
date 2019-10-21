package com.yundaxue.dao;

import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;

/**
 * �������͵ķ����ӿ�
 * @author ZZ
 *
 */
public interface IPublishDao {
	/**
	 * �ѵõ������Ա�д�����ݿ�
	 * @param message ������Ϣʵ�������
	 * @return ��Ӱ������
	 */
	int publishMessageDao(Message message);
	/**
	 * ʧ������Dao������д�����ݿ�
	 * @param laf ʧ������ʵ�������
	 * @return ��Ӱ������
	 */
	int publishLostFoundDao(LostAndFound laf);
	/**
	 * �������ֽ���д�����ݿ�
	 * @param si ���ֽ���ʵ�������
	 * @return ������Ӱ������
	 */
	int publishTransactionDao(ShopInfo si);
	
	/**
	 * �������֪ͨ���������˺ſ��Է�����
	 * @param ai ���֪ͨʵ�������
	 * @return ������Ӱ������
	 */
	int publishActivityDao(ActivityInfo ai);
}
