package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo2_Send {

	/*
	 * 1������Send
	 * ����DatagramSocket,����˿ں�
	 * ����DatagramPacket,ָ�����ݡ����ȡ���ַ���˿�
	 * ʹ��DatagramSocket����DatagramPacket
	 * �ر�DatagramSocket
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();   //����socket,
		
		while(true) {
			String str = sc.nextLine();
			if("quit".equals(str)) {
				break;
			}
			DatagramPacket packet =                         //����packet���൱�ڼ�װ�� 
					new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);                            //�����ݷ���ȥ
		}
		socket.close();                                 //�ر�socket
		
	}
}
