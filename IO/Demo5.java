package com.heima.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("1.jpg"); //��������������
		FileOutputStream fos = new FileOutputStream("2.jpg"); //�������������
		//Ĭ�ϵ��ļ�·���ǣ�day19Ŀ¼�¼��ɣ�
		
//		int n;
//		while((n = fis.read()) != -1) { //���ϵĶ�ȡÿһ���ֽ�
//			fos.write(n);     //���ϵĽ�ÿһ���ֽ�д���ļ���
//		}
		
		//�ڶ��ֿ������Ƽ�ʹ�ã���Ϊ�п����ڴ����
		byte[] arr = new byte[fis.available()];  //�������ļ�һ����С���ֽ�����
		fis.read(arr);         //���ļ��ϵ��ֽڶ�ȡ���ڴ���(arr��)
		fos.write(arr);        //���ֽ������е��ֽ�����д���ļ���
		
		fis.close();   //�����ͷ���Դ
		fos.close();
	}
}
