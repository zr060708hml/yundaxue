package com.yundaxue.dao;

import com.yundaxue.pojo.OrderInfo;

/**
 * ���ɶ�����ϢDao��
 * @author zbx,zzg
 *
 */
public interface IPublishOrderInfoDao {
	/**
	 * �����ɵĶ�����Ϣд�����ݿ�
	 * @param oi
	 * @return
	 */
	int publishOrderInfo(OrderInfo oi);
}
