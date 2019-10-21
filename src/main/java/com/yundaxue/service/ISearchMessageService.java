package com.yundaxue.service;

import java.util.List;

import com.yundaxue.util.omnipotent;
import com.yundaxue.util.selectpojo.SelectAllMessages;
import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author zbx
 *
 */
public interface ISearchMessageService {
	/**
	 * ��ʾ����
	 * @param index ��ǰҳ��
	 * @param sizePage һҳ��ʾ����Ŀ��
	 * @return ����ʵ���༯��
	 */
	List<SelectAllMessages> searchMessage(int index,int sizePage);
	/**
	 * ��ʾ����
	 * @param index ��ǰҳ��
	 * @param sizePage һҳ��ʾ����Ŀ��
	 * @param messageId ����id
	 * @return ����ʵ���༯��
	 */
	List<SelectAllRemarksWithinMessage> searchRemark(int index,int sizePage,int messageId);
	/**
	 * ��ʾ�ظ�
	 * @param index ��ǰҳ��
	 * @param sizePage һҳ��ʾ����Ŀ��
	 * @param remarkId ����id
	 * @return ����ʵ���༯��
	 */
	List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage,int remarkId);
	/**
	 * ��ʾʧ������
	 * @param index ��ǰҳ��
	 * @param sizePage һҳ��ʾ����Ŀ��
	 * @return ����ʵ���༯��
	 */
	List<omnipotent> searchLostFound(int index, int sizePage);
	
	
}
