package com.heima.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("1.jpg"); //创建输入流对象
		FileOutputStream fos = new FileOutputStream("2.jpg"); //创建输出流对象
		//默认的文件路径是：day19目录下即可；
		
//		int n;
//		while((n = fis.read()) != -1) { //不断的读取每一个字节
//			fos.write(n);     //不断的将每一个字节写入文件中
//		}
		
		//第二种拷贝不推荐使用，因为有可能内存溢出
		byte[] arr = new byte[fis.available()];  //创建与文件一样大小的字节数组
		fis.read(arr);         //将文件上的字节读取到内存中(arr中)
		fos.write(arr);        //将字节数组中的字节数据写到文件上
		
		fis.close();   //关流释放资源
		fos.close();
	}
}
