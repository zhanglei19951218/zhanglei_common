package com.zhanglei.common.utils;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		
		for (int i = 0; i <= 4; i++) {
			int random = RandomUtil.random(3, 7);
			
			
			System.out.println(random);
		}
		
		
		
	}

	@Test
	public void testSubRandom() {
		
		for (int i = 0; i <= 4; i++) {
			char random =  RandomUtil.randomCharacter();
			
			
			System.out.println(random);
		}
	}

	@Test
	public void testRandomCharacter() {
		int[] subRandom = RandomUtil.subRandom(1, 8, 4);
		
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomString() {
		
		String randomString = RandomUtil.randomString(5);
		
		System.out.println(randomString);
		
	}

}
