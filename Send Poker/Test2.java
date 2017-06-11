package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * 模拟斗地主，此时是进行发牌之后的排序生成的结果
 HashMap<Integer, String> 存放的是数字和颜色
 ArrayList,洗牌洗的是索引，然后根据索引获取值,值就相当于被洗乱了
 */

public class Test2 {
	public static void main(String[] args) {
		//1、首先生成牌，数字和颜色
		String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] color = {"红桃", "黑桃", "方片", "梅花"};
		HashMap<Integer, String> hm = new HashMap<>();  //存储索引和牌
		ArrayList<Integer> list = new ArrayList<>();  //存储索引
		int index = 0;
		
		//拼接牌，并将牌和索引存储在hm中
		for(String s1 : num) {  //获取数字
			for(String s2 : color) {  //获取颜色
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		//将大小王添加到HashMap中
		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);
		
		//2、洗牌
		Collections.shuffle(list);  //此时其索引下标将是无序的
		//3、发牌
		//TreeSet集合，可以自动的排序
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
		
		//4、看牌(都是重复的,抽取一个方法即可)
		lookPoker(hm, p1, "p1");
		lookPoker(hm, p2, "p2");
		lookPoker(hm, p3, "p3");
		lookPoker(hm, dipai, "dipai");
	}
	public static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
		System.out.print(name + "的牌是 : ");
		for(Integer i : ts) {   //i代表HashMap中的每一个键
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
	
}
