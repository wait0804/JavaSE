package com.heima.map;

import java.util.HashMap;

public class Demo2 {
	public static void main(String[] args) {
		String s = "aaaabbbbbbbcccccccccddddddd"; //����һ����Ҫ��ͳ�Ƶ��ַ���
		char[] arr = s.toCharArray(); //���ַ���ת��Ϊ�ַ�����
		HashMap<Character, Integer> hm = new HashMap<>(); //����һ������,ͳ����ĸ������ֵ�Ƶ��
		
		for(char c : arr) {  //�����ַ�����
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1); //ͳ����ĸ�����༰Ƶ��
		}
		//��ӡ�������
		for(Character key : hm.keySet()) { //hm.keySet()�������м��ļ���
			System.out.println(key + "=" + hm.get(key));  //hm.get(key)���ݼ���ȡֵ
		}
		
	}
}
