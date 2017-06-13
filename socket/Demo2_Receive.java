package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo2_Receive {
	/*
	 * 2、接收Receive
	 * 创建DatagramSocket,指定端口号
	 * 创建DatagramPacket,指定数据、长度
	 * 使用DatagramSocket接收DatagramPacket
	 * 关闭DatagramSocket
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);  //创建socket
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024); //创建Packet，相当于创建集装箱
		
		while(true) {
			socket.receive(packet);
			
			byte[] arr = packet.getData();           //获取数据
			int len = packet.getLength();            //获取有效的字节个数
			String ip = packet.getAddress().getHostAddress(); //获取IP地址
			int port = packet.getPort();
			System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
		}			
	}
}
