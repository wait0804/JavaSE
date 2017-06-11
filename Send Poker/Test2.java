package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * ģ�⶷��������ʱ�ǽ��з���֮����������ɵĽ��
 HashMap<Integer, String> ��ŵ������ֺ���ɫ
 ArrayList,ϴ��ϴ����������Ȼ�����������ȡֵ,ֵ���൱�ڱ�ϴ����
 */

public class Test2 {
	public static void main(String[] args) {
		//1�����������ƣ����ֺ���ɫ
		String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] color = {"����", "����", "��Ƭ", "÷��"};
		HashMap<Integer, String> hm = new HashMap<>();  //�洢��������
		ArrayList<Integer> list = new ArrayList<>();  //�洢����
		int index = 0;
		
		//ƴ���ƣ������ƺ������洢��hm��
		for(String s1 : num) {  //��ȡ����
			for(String s2 : color) {  //��ȡ��ɫ
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		//����С����ӵ�HashMap��
		hm.put(index, "С��");
		list.add(index);
		index++;
		hm.put(index, "����");
		list.add(index);
		
		//2��ϴ��
		Collections.shuffle(list);  //��ʱ�������±꽫�������
		//3������
		//TreeSet���ϣ������Զ�������
		TreeSet<Integer> p1 = new TreeSet<>();
		TreeSet<Integer> p2 = new TreeSet<>();
		TreeSet<Integer> p3 = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		for(int i = 0; i < list.size(); i++) {
			if(i >= list.size()-3) {
				dipai.add(list.get(i));
			}else if(i % 3 == 0) {
				p1.add(list.get(i));
			}else if(i % 3 == 1) {
				p2.add(list.get(i));
			}else {
				p3.add(list.get(i));
			}
		}
		
		//4������(�����ظ���,��ȡһ����������)
		lookPoker(hm, p1, "p1");
		lookPoker(hm, p2, "p2");
		lookPoker(hm, p3, "p3");
		lookPoker(hm, dipai, "dipai");
	}
	public static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
		System.out.print(name + "������ : ");
		for(Integer i : ts) {   //i����HashMap�е�ÿһ����
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
	
}
