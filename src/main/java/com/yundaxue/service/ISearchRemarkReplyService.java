package com.yundaxue.service;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author ZZG
 *
 */
public interface ISearchRemarkReplyService {
	/**
	 * ��ҳ��ѯ�����µ���������
	 * @param index ��ǰҳ��
	 * @param sizePage ÿҳ������
	 * @param messageid ����id
	 * @return ���ط�ҳ����������
	 */
	List<SelectAllRemarksWithinMessage> searchRemark(int index, int sizePage, int messageid);
	
	/**
	 * ��ҳ��ѯ�����µ����лظ�
	 * @param index ��ǰҳ��
	 * @param sizePage ÿҳ��Ŀ��
	 * @param remarkid ����id
	 * @return ���ط�ҳ�Ļظ�����
	 */
	List<SelectAllReplysWithinRemark> searchReply(int index,int sizePage,int remarkid);
}
