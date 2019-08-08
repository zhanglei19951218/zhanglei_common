package com.zhanglei.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
		Date date = DateUtil.getDateByInitMonth(new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(df.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2019, 1, 12);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(df.format(date));
	}

}
