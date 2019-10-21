package com.yundaxue.service;

import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;

/**
 * ���з������ݵ�Service��
 * @author ZZ
 *
 */
public interface IPublishService {
	
	/**
	 * 
	 * @param mag messageʵ����
	 * @return �������
	 */
	String publishMessageService(Message mag);
	/**
	 * 
	 * @param laf LostAndFoundʵ����
	 * @return �������
	 */
	String LostFoundService(LostAndFound laf);
	/**
	 * 
	 * @param si ShopInfoʵ����
	 * @return �������
	 */
	String publishTransactionService(ShopInfo si);
	/**
	 * 
	 * @param ai ActivityInfoʵ����
	 * @return �������
	 */
	String publishActivityService(ActivityInfo ai);

}
