package com.heima.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo2_Receive {
	/*
	 * 2������Receive
	 * ����DatagramSocket,ָ���˿ں�
	 * ����DatagramPacket,ָ�����ݡ�����
	 * ʹ��DatagramSocket����DatagramPacket
	 * �ر�DatagramSocket
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);  //����socket
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024); //����Packet���൱�ڴ�����װ��
		
		while(true) {
			socket.receive(packet);
			
			byte[] arr = packet.getData();           //��ȡ����
			int len = packet.getLength();            //��ȡ��Ч���ֽڸ���
			String ip = packet.getAddress().getHostAddress(); //��ȡIP��ַ
			int port = packet.getPort();
			System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
		}			
	}
}