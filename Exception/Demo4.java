package com.heima.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * ��һ�����try...catch��Ƕ��ʹ��
 * ����¼��һ��int���͵�����������������Ʊ�����ʽ
 * ���¼�����������������¼��һ������BigInteger
 * ���¼�����С����������ʾ��¼�����С����������¼��һ������
 * ���¼����������ַ���������ʾ��¼����ǷǷ��ַ���������¼��һ������
 * 
 * ����:
 * ������¼��Ľ���洢��String���͵��ַ����У��洢int����������в�����������ֱ�ӱ����޷����к������жϣ�
 * �ַ���ת��Ϊint,��ʱ��ȷֱ��ת��������Ҫ���ж�Ӧ�ж�
 */

public class Demo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������ : ");
		
		while(true) {
			String line = sc.nextLine();
			try {
				int num = Integer.parseInt(line);  //���ַ���ת��Ϊ����
				System.out.println(Integer.toBinaryString(num));  //������ת��Ϊ������
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);  //ֻҪ�ܷŵ�BigInteger�еĶ��ǹ��������
					System.out.println("¼�������¼�����һ�����������������������һ������");
				}catch(Exception e1) {
					try {
						new BigDecimal(line); //��С�������������װ���£�
						System.out.println("¼�������¼�����һ��С��������������һ������");						
					}catch(Exception e2) {
						System.out.println("¼�������¼����ǷǷ��ַ�������������һ������");
					}
				}
				
			}
		}
	}
}
