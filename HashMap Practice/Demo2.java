package com.heima.map;

import java.util.HashMap;

public class Demo2 {
	public static void main(String[] args) {
		String s = "aaaabbbbbbbcccccccccddddddd"; //定义一个需要被统计的字符串
		char[] arr = s.toCharArray(); //将字符串转化为字符数组
		HashMap<Character, Integer> hm = new HashMap<>(); //定义一个集合,统计字母及其出现的频度
		
		for(char c : arr) {  //遍历字符数组
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1); //统计字母的种类及频度
		}
		//打印是无序的
		for(Character key : hm.keySet()) { //hm.keySet()代表所有键的集合
			System.out.println(key + "=" + hm.get(key));  //hm.get(key)根据键获取值
		}
		
	}
}
