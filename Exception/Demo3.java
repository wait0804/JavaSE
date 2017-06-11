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
			System.out.println("除数不能为0");
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("索引越界了");
		}catch(Exception e) { //父类引用子类对象 Exception e = new ArithmeticException();
			System.out.println("出错了");
		}
		
		//理论上，什么异常都进行自己异常类的匹配，进行接收即可;
		//但是在实际开发中，直接使用Exception e来进行接收
		//javaEE一般在服务端的开发,底层开发，从底层向上
		System.out.println("over");
	}
}
