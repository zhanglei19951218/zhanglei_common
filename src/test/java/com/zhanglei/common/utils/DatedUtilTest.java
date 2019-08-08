package com.zhanglei.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DatedUtilTest {

	@Test
	public void testGetDate() {
		
		int date = DateUtil.getDate(new Date());
		
		System.out.println(date);
	}

}
