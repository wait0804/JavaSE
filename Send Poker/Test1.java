package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌，每个人所拿的牌是没有顺序的
 * 分析思路：
 * 	1、先创建牌，将牌存储起来
 * 	2、洗牌
 * 	3、发牌
 * 	4、看牌
 */
public class Test1 {
	public static void main(String[] args) {
		//1、首先生成牌，数字和颜色
		String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] color = {"红桃", "黑桃", "方片", "梅花"};
		ArrayList<String> poker = new ArrayList<>();
		
		for(String s1 : color) {
			for(String s2 : num) {
				poker.add(s1.concat(s2));  //concat连接2个字符串
			}
		}
		poker.add("小王");
		poker.add("大王");
		//2、洗牌
		Collections.shuffle(poker);
		//3、发牌
		ArrayList<String> p1 = new ArrayList<>(); //创建3个人进行发牌
		ArrayList<String> p2 = new ArrayList<>();
		ArrayList<String> p3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>(); //留的3张底牌
		for(int i = 0; i < poker.size(); i++) {
			if(i >= poker.size()-3) {
				dipai.add(poker.get(i));  //将三张底牌存储在底牌集合中
			}else if(i % 3 == 0) {
				p1.add(poker.get(i));
			}else if(i % 3 == 1) {
				p2.add(poker.get(i));
			}else{
				p3.add(poker.get(i));
			}
		}
		//4、看牌
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("底牌  : " + dipai);
	}
}


