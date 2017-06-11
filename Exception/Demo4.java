package com.heima.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * 是一个针对try...catch的嵌套使用
 * 键盘录入一个int类型的整数，对其求二进制表现形式
 * 如果录入的整数过大，请重新录入一个整数BigInteger
 * 如果录入的是小数，给予提示，录入的是小数，请重新录入一个整数
 * 如果录入的是其他字符，给予提示，录入的是非法字符，请重新录入一个整数
 * 
 * 分析:
 * 将键盘录入的结果存储在String类型的字符串中，存储int类型中如果有不符合条件的直接报错，无法进行后续的判断；
 * 字符串转换为int,此时正确直接转换，错误要进行对应判断
 */

public class Demo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数 : ");
		
		while(true) {
			String line = sc.nextLine();
			try {
				int num = Integer.parseInt(line);  //将字符串转换为整数
				System.out.println(Integer.toBinaryString(num));  //将整数转换为二进制
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);  //只要能放到BigInteger中的都是过大的整数
					System.out.println("录入错误，你录入的是一个过大的整数，请重新输入一个整数");
				}catch(Exception e1) {
					try {
						new BigDecimal(line); //是小数，在这里可以装的下；
						System.out.println("录入错误，你录入的是一个小数，请重新输入一个整数");						
					}catch(Exception e2) {
						System.out.println("录入错误，你录入的是非法字符，请重新输入一个整数");
					}
				}
				
			}
		}
	}
}
