package com.heima.thread;

public class Demo3 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		
	}
}

//饿汉式
//class Singleton {
//	//1、私有构造方法，其他类不能访问该构造方法
//	private Singleton() {}
//	//2、创建本类对象
//	private static Singleton s = new Singleton();
//	//3、对外提供公共的访问方法
//	public static Singleton getInstance() {  //获取对象
//		return s;
//	}	
//}

//懒汉式
class Singleton {
	//1、私有构造方法，其他类不能访问该构造方法
	private Singleton() {}
	//2、声明一个引用，不创建对象
	private static Singleton s;
	//3、对外提供公共的访问方法
	public static Singleton getInstance() {  //获取对象
		if(s == null){
			//线程1等待，线程2等待
			s = new Singleton();
		}	
		return s;
	}	
}

