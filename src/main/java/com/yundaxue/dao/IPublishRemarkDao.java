package com.yundaxue.dao;

import com.yundaxue.pojo.RemarkInfo;
import com.yundaxue.pojo.ReplyInfo;

/**
 * 
 * @author zbx
 *
 */
public interface IPublishRemarkDao {
	/**
	 * 
	 * @param ri ���۵�ʵ�������
	 * @return ����һ����Ӱ������
	 */
	int PublishRemarkDao(RemarkInfo ri);
	/**
	 * 
	 * @param rpl  �ظ���ʵ�������
	 * @return ����һ����Ӱ������
	 */
	int PublishReply(ReplyInfo rpl);
	
}
