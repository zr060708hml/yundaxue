package com.yundaxue.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author ZZG
 * ����ת��ʱ������
 */
public class ConversionTimeType {
	public String transform(Timestamp time){
		String endAtStr =null;
		try {
			String endAt= time.toString();  
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = simpleDateFormat.parse(endAt);
			endAtStr = simpleDateFormat.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return endAtStr;
		
	}
}
