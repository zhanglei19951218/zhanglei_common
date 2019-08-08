package com.zhanglei.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {
		
		String readTextFile = StreamUtil.readTextFile(new FileInputStream("D:/aa.txt"));
		
		System.out.println(readTextFile);
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new File("D:/aa.txt"));
		System.out.println(string);
	}

}
