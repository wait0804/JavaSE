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
 * 做了一个窗口界面
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
		Panel center = new Panel();  //创建中间的Panel
		TextArea viewText = new TextArea(); //显示的文本区域
		TextArea sendText = new TextArea(5, 1); //发送的文本区域
		center.setLayout(new BorderLayout()); 
		center.add(sendText, BorderLayout.SOUTH);
		center.add(viewText, BorderLayout.CENTER);
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);  //设置背景颜色
		sendText.setFont(new Font("xxx", Font.PLAIN, 20));
		viewText.setFont(new Font("xxx", Font.PLAIN, 20));
		this.add(center, BorderLayout.CENTER);
	}
	
	public void southPanel() {
		Panel south = new Panel();  //创建南边的Panel
		TextField tf = new TextField(15);  //创建文本字段存储ip地址
		Button send = new Button("发送");  //创建发送按钮
		Button log = new Button("记录");
		Button clear = new Button("清屏");
		Button shake = new Button("震动");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south, BorderLayout.SOUTH);   //将Panel放在Frame的南边
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
