package com.yundaxue.service.impl;

import java.util.List;

import com.yundaxue.dao.impl.SearchMessageDaoImpl;
import com.yundaxue.dao.impl.SearchRemarkReplyDaoImpl;
import com.yundaxue.service.ISearchMessageService;
import com.yundaxue.util.Paging;
import com.yundaxue.util.omnipotent;
import com.yundaxue.util.selectpojo.SelectAllMessages;
import com.yundaxue.util.selectpojo.SelectAllRemarksWithinMessage;
import com.yundaxue.util.selectpojo.SelectAllReplysWithinRemark;
/**
 * 
 * @author ZZG
 *
 */
public class SearchMessageServiceImpl implements ISearchMessageService {
	
	Paging p =new Paging(); 
	SearchMessageDaoImpl smdi = new SearchMessageDaoImpl();
	
	public List<SelectAllRemarksWithinMessage> searchRemark(int index, int sizePage, int messageId) {
		SearchRemarkReplyDaoImpl srrdi = new SearchRemarkReplyDaoImpl();
		String sql = "select count(1) from remark_info";
		int index1 = p.fenPage(index, sizePage,sql);
		List<SelectAllRemarksWithinMessage>  sarwm = srrdi.searchRemarkDao(index1, sizePage, messageId);
		return sarwm;
	}

	public List<SelectAllReplysWithinRemark> searchReply(int index, int sizePage, int remarkId) {
		SearchRemarkReplyDaoImpl srrdi = new SearchRemarkReplyDaoImpl();
		String sql = "select count(1) from reply_info";
		int index1 = p.fenPage(index, sizePage,sql);
		List<SelectAllReplysWithinRemark> sarwm = srrdi.searchReplyDao(index1, sizePage, remarkId);
		return sarwm;
	}

	public List<SelectAllMessages> searchMessage(int index, int sizePage) {
		String sql = "select count(1) from message_info";
		int index1 = p.fenPage(index, sizePage,sql);
		List<SelectAllMessages> sam = smdi.searchMessage(index1, sizePage);
		
		return sam;
	}

	public List<omnipotent> searchLostFound(int index, int sizePage) {
		String sql = "select count(1) from lost_found_info";
		int index1 = p.fenPage(index, sizePage,sql);
		return null;
	}
}
