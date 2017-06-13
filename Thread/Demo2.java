package com.heima.thread;

public class Demo2 {
	/*
	 * 需求：铁路售票，一共100张，通过4个窗口卖完
	 */
	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}

}

class Ticket extends Thread {
	private static int ticket = 100;
	
	public void run() {
		while(true) {
			synchronized (Ticket.class) {
				if(ticket == 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(getName() + "这是第" + ticket-- + "号票"); //getName<==>this.getName(),获取当前线程的名称				
			}
		}
	}
}
