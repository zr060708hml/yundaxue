package com.yundaxue.dao;

import java.util.List;

import com.yundaxue.util.selectpojo.SelectAllMessages;

public interface ISearchMessageTypeDao {
	/**
	 * ��������ҳ��ѯ����
	 * @param index ��ǰҳ��
	 * @param sizePage һҳ����������
	 * @param messageType ��������
	 * @return
	 */
	List<SelectAllMessages> searchMessageType(int index, int sizePage, int messageType);
}
