package com.zhanglei.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		
		//获取默认日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期初始化日历类		
		
		c.setTime(src);
		//设置日历类月的第一天
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	//TODO 实现代码
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		
		Date date = getDateByInitMonth(src);
		
		//获取默认日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期初始化日历类		
		
		c.setTime(date);
		
		//让月+1
		c.add(Calendar.MONTH, 1);
		
		//让秒-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	//TODO 实现代码
	}

	public static int getDate(Date src){
		
		Date date = getDateByInitMonth(src);
		
		//获取默认日历类
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		
		c.add(Calendar.SECOND,-1);
		
		return c.get(Calendar.DATE);
	}
}
