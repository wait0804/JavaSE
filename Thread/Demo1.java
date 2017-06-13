package com.heima.thread;

//2种匿名内部类线程的实现
public class Demo1 {
	public static void main(String[] args) {
		new Thread() {  //继承Thread类
			public void run() {  //重写run()方法
				for(int i = 0; i < 1000; i++) {  //将要执行的代码写在run()中
					System.out.println("aaaaaaaaaaaaa");
				}
			}
		}.start();  //开启线程
		
		new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 1000; i++) {  //将要执行的代码写在run()中
					System.out.println("bbbbbbbbbbbbb");
				}
			}
		}).start();
	}
}
