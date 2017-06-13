package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Demo1_Send {

	/*
	 * 1、发送Send
	 * 创建DatagramSocket,随机端口号
	 * 创建DatagramPacket,指定数据、长度、地址、端口
	 * 使用DatagramSocket发送DatagramPacket
	 * 关闭DatagramSocket
	 */
	public static void main(String[] args) throws Exception {
		String str = "Hello";
		DatagramSocket socket = new DatagramSocket();   //创建socket,
		DatagramPacket packet =                         //创建packet，相当于集装箱 
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);                            //将数据发出去
		socket.close();                                 //关闭socket
		
	}
}
