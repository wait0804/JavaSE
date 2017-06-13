package com.heima.thread;

public class Demo3 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		
	}
}

//����ʽ
//class Singleton {
//	//1��˽�й��췽���������಻�ܷ��ʸù��췽��
//	private Singleton() {}
//	//2�������������
//	private static Singleton s = new Singleton();
//	//3�������ṩ�����ķ��ʷ���
//	public static Singleton getInstance() {  //��ȡ����
//		return s;
//	}	
//}

//����ʽ
class Singleton {
	//1��˽�й��췽���������಻�ܷ��ʸù��췽��
	private Singleton() {}
	//2������һ�����ã�����������
	private static Singleton s;
	//3�������ṩ�����ķ��ʷ���
	public static Singleton getInstance() {  //��ȡ����
		if(s == null){
			//�߳�1�ȴ����߳�2�ȴ�
			s = new Singleton();
		}	
		return s;
	}	
}

