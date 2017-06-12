package com.heima.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//字符流文件内容的拷贝
public class Demo7 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}
}
