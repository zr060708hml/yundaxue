package com.yundaxue.service;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllMessages;
/**
 * 
 * @author ZZG
 *
 */
public interface ISearchMessageTypeService {
	/**
	 * �����ѯ����Service��
	 * @param index ��ǰҳ��
	 * @param sizePage ÿҳ��ʾ����
	 * @param messageType ��������
	 * @return ����ʵ������󼯺�
	 */
	List<SelectAllMessages> searchMessageTypeService(int index, int sizePage, int messageType);
}
