package com.yundaxue.service;

/**
 * 
 * @author zbx
 *
 */
public interface IPublishRemarkService {
	/**
	 * ��������
	 * @param remake_id ����id
	 * @param remake_image ���۵�ͼƬ
	 * @param user_id ��Ӧ�������û�id
	 * @param remark_creatime ���۴���ʱ��
	 * @param remake_content ��������
	 * @param message_id ����id
	 * @return ���۵Ľ��
	 */
	 String publishRemark(String remake_image,int user_id,String remark_creatime,String remake_content,int message_id);

	 /**
	  * �ظ�����
	  * @param reply_id �ظ�id
	  * @param remark_target_id  ����Ŀ��id
	  * @param remark_target_type �ظ���Ŀ������,1��������,2��������
	  * @param reply_user_id	�ظ����˵�id
	  * @param reply_creatime	�ظ�����ʱ��
	  * @param reply_content 	�ظ�����
	  * @param reply_target_user_id �ظ�Ŀ���û�id
	  * @param reply_father_id �ظ�����id
	  * @return �ظ��Ľ��
	  */
	 String PublishReplyService(int remark_target_id,int remark_target_type , int reply_user_id,String reply_creatime,String reply_content,int reply_target_user_id,int reply_father_id);
}
