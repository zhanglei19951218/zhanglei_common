package com.zhanglei.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ... autoCloseable){
	
		if(autoCloseable != null) {
			
			for (AutoCloseable autoCloseable2 : autoCloseable) {
				try {
					autoCloseable2.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		//TODO 实现代码
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，
	* 要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
		
		byte[] b = new byte[2014];
		
		String str = "";
		
		int x ;
		while((x=src.read(b))!= -1) {
			
			str += new String(b,"utf-8");
		}
		
		closeAll(src);
		return str;
	//TODO 实现代码
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，
	* 并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		
		
		return readTextFile(new FileInputStream(txtFile));
	//TODO 实现代码
	}

}
