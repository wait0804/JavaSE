package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Demo1_Send {

	/*
	 * 1������Send
	 * ����DatagramSocket,����˿ں�
	 * ����DatagramPacket,ָ�����ݡ����ȡ���ַ���˿�
	 * ʹ��DatagramSocket����DatagramPacket
	 * �ر�DatagramSocket
	 */
	public static void main(String[] args) throws Exception {
		String str = "Hello";
		DatagramSocket socket = new DatagramSocket();   //����socket,
		DatagramPacket packet =                         //����packet���൱�ڼ�װ�� 
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);                            //�����ݷ���ȥ
		socket.close();                                 //�ر�socket
		
	}
}
