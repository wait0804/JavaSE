package com.heima.exception;

public class Demo3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {11, 22, 33, 44, 55,};
		
		try {
			System.out.println(a / b);
			System.out.println(arr[10]);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("����Խ����");
		}catch(Exception e) { //��������������� Exception e = new ArithmeticException();
			System.out.println("������");
		}
		
		//�����ϣ�ʲô�쳣�������Լ��쳣���ƥ�䣬���н��ռ���;
		//������ʵ�ʿ����У�ֱ��ʹ��Exception e�����н���
		//javaEEһ���ڷ���˵Ŀ���,�ײ㿪�����ӵײ�����
		System.out.println("over");
	}
}
