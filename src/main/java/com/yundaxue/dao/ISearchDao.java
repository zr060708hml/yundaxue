package com.yundaxue.dao;

import java.util.List;

/*import com.yundaxue.pojo.ActivityInfo;
import com.yundaxue.pojo.LostAndFound;
import com.yundaxue.pojo.Message;
import com.yundaxue.pojo.ShopInfo;*/
import com.yundaxue.util.omnipotent;
import com.yundaxue.util.selectpojo.SelectAllMessages;

public interface ISearchDao {
	/**
	 * ��ҳչʾ����������Ϣ
	 * @param index  ��ǰҳ��
	 * @param sizePage  ÿҳ������Ϣ
	 * @return �������͵�ʵ���༯��
	 */
	List<SelectAllMessages> searchMessage(int index,int sizePage);
	/**
	 * ��ҳչʾ���ж�����Ʒ��Ϣ
	 * @param index  ��ǰҳ��
	 * @param sizePage  ÿҳ������Ϣ
	 * @return ��Ʒ���͵�ʵ���༯��
	 */
	List<omnipotent> searchShopInfo(int index,int sizePage);
	/**
	 * ��ҳչʾ����ʧ��������Ϣ
	 * @param index  ��ǰҳ��
	 * @param sizePage  ÿҳ������Ϣ
	 * @return ʧ���������͵�ʵ���༯��
	 */
	List<omnipotent> searchLostFound(int index,int sizePage);
	/**
	 * ��ҳ�鿴���л
	 * @param index ��ǰҳ��
	 * @param sizePage ÿҳ��ʾ������Ϣ
	 * @return ����ʵ���༯��
	 */
	List<omnipotent> searchActivity(int index,int sizePage);
}
