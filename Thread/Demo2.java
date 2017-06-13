package com.heima.thread;

public class Demo2 {
	/*
	 * ������·��Ʊ��һ��100�ţ�ͨ��4����������
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
				System.out.println(getName() + "���ǵ�" + ticket-- + "��Ʊ"); //getName<==>this.getName(),��ȡ��ǰ�̵߳�����				
			}
		}
	}
}
