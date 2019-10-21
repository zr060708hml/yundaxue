package com.yundaxue.dao;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author ZZG
 *
 */
public interface ISearchRemarkReplyDao {
	/**
	 * ��ҳ��ѯ����������������
	 * @param index ��ǰҳ��
	 * @param sizePage ÿһҳ������
	 * @param messageId ��Щ������������id
	 * @return ��ѯ����ʵ������󼯺�
	 */
	List<SelectAllRemarksWithinMessage> searchRemarkDao(int index, int sizePage, int messageId);

	/**
	 * ��ҳ��ѯ�����µ����лظ�
	 * @param index ��ǰҳ��
	 * @param sizePage ÿһҳ������
	 * @param remarkId ��Щ�ظ�����������id
	 * @return ��ѯ����ʵ�������
	 */
	List<SelectAllReplysWithinRemark> searchReplyDao(int index, int sizePage, int remarkId);
	
	/**
	 * ��ҳ��ѯ�����������лظ�
	 * @param index ��ǰҳ��
	 * @param sizePage ÿһҳ������
	 * @param remarkid ��Щ�ظ�����������id
	 * @return ��ѯ����ʵ�������
	 */
	List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage, int remarkid);

}