package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ģ�⶷����ϴ�ƺͷ��ƣ�ÿ�������õ�����û��˳���
 * ����˼·��
 * 	1���ȴ����ƣ����ƴ洢����
 * 	2��ϴ��
 * 	3������
 * 	4������
 */
public class Test1 {
	public static void main(String[] args) {
		//1�����������ƣ����ֺ���ɫ
		String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] color = {"����", "����", "��Ƭ", "÷��"};
		ArrayList<String> poker = new ArrayList<>();
		
		for(String s1 : color) {
			for(String s2 : num) {
				poker.add(s1.concat(s2));  //concat����2���ַ���
			}
		}
		poker.add("С��");
		poker.add("����");
		//2��ϴ��
		Collections.shuffle(poker);
		//3������
		ArrayList<String> p1 = new ArrayList<>(); //����3���˽��з���
		ArrayList<String> p2 = new ArrayList<>();
		ArrayList<String> p3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>(); //����3�ŵ���
		for(int i = 0; i < poker.size(); i++) {
			if(i >= poker.size()-3) {
				dipai.add(poker.get(i));  //�����ŵ��ƴ洢�ڵ��Ƽ�����
			}else if(i % 3 == 0) {
				p1.add(poker.get(i));
			}else if(i % 3 == 1) {
				p2.add(poker.get(i));
			}else{
				p3.add(poker.get(i));
			}
		}
		//4������
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("����  : " + dipai);
	}
}


