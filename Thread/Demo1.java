package com.heima.thread;

//2�������ڲ����̵߳�ʵ��
public class Demo1 {
	public static void main(String[] args) {
		new Thread() {  //�̳�Thread��
			public void run() {  //��дrun()����
				for(int i = 0; i < 1000; i++) {  //��Ҫִ�еĴ���д��run()��
					System.out.println("aaaaaaaaaaaaa");
				}
			}
		}.start();  //�����߳�
		
		new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 1000; i++) {  //��Ҫִ�еĴ���д��run()��
					System.out.println("bbbbbbbbbbbbb");
				}
			}
		}).start();
	}
}
