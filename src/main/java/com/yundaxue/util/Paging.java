package com.yundaxue.util;

import com.yundaxue.dao.impl.SearchMessageDaoImpl;
/**
 * 
 * @author ZZG
 *
 */
public class Paging {
	/**
	 * 通用分页
	 * @param index  当前页码
	 * @param sizePage  每页显示的条数
	 * @param sql sql语句
	 * @return 当前页码 最小是1，最大是总页数 
	 */
	public int fenPage(int index,int sizePage,String sql) {
		SearchMessageDaoImpl smdi = new SearchMessageDaoImpl();
		Page p = new Page();
		int count = smdi.getCount(sql);
		p.setTotalCount(count);
		p.setPageSize(sizePage);
		if(index > p.getPageCount()){
			p.setIndex(p.getPageCount());
		}else if(index < 1){
			p.setIndex(1);
		}else{
			p.setIndex(p.getIndex());
		}
		return p.getIndex();
	}
	/**
	 * 根据需求进行分页查询
	 * @param index 当前页码
	 * @param sizePage 每页的条目数
	 * @param id 所根据某个序号
	 * @param tableName 要查询的表名
	 * @param requirement 要查询的条件名（列名）
	 * @return 特定需求下的总条目数
	 */
	public int fenPageByRequirement(int index,int sizePage,int id, String tableName, String requirement) {
		SearchMessageDaoImpl smdi = new SearchMessageDaoImpl();
		Page p = new Page();
		int count = smdi.getCountByRequirement(id, tableName, requirement);
		p.setTotalCount(count);
		p.setPageSize(sizePage);
		if(index > p.getPageCount()){
			p.setIndex(p.getPageCount());
		}else if(index < 1){
			p.setIndex(1);
		}else{
			p.setIndex(p.getIndex());
		}
		return p.getIndex();
	}
}
