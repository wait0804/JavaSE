package com.heima.socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * ����һ�����ڽ���
 */

public class Demo3_GUIChat extends Frame{
	
	public Demo3_GUIChat() {
		init();
		southPanel();
		centerPanel();
		event();
	}
	public void event() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void centerPanel() {
		Panel center = new Panel();  //�����м��Panel
		TextArea viewText = new TextArea(); //��ʾ���ı�����
		TextArea sendText = new TextArea(5, 1); //���͵��ı�����
		center.setLayout(new BorderLayout()); 
		center.add(sendText, BorderLayout.SOUTH);
		center.add(viewText, BorderLayout.CENTER);
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);  //���ñ�����ɫ
		sendText.setFont(new Font("xxx", Font.PLAIN, 20));
		viewText.setFont(new Font("xxx", Font.PLAIN, 20));
		this.add(center, BorderLayout.CENTER);
	}
	
	public void southPanel() {
		Panel south = new Panel();  //�����ϱߵ�Panel
		TextField tf = new TextField(15);  //�����ı��ֶδ洢ip��ַ
		Button send = new Button("����");  //�������Ͱ�ť
		Button log = new Button("��¼");
		Button clear = new Button("����");
		Button shake = new Button("��");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south, BorderLayout.SOUTH);   //��Panel����Frame���ϱ�
	}
	
	public void init() {
		this.setLocation(500, 50);
		this.setSize(400, 600);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Demo3_GUIChat();
	}
}
