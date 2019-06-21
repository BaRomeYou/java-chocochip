package com.encore.coffree.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

public class FindID extends JFrame{

	public JButton bt_findID, bt_findPass, bt_close;

	public FindID() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("아이디비번찾기");

		bt_findPass = new JButton("비밀번호찾기");
		bt_findPass.setForeground(Color.BLACK);
		bt_findPass.setFont(new Font("굴림", Font.BOLD, 15));
		bt_findPass.setBackground(Color.MAGENTA);
		
		bt_findID = new JButton("아이디찾기");
		bt_findID.setForeground(Color.BLACK);
		bt_findID.setFont(new Font("굴림", Font.BOLD, 15));
		bt_findID.setBackground(Color.MAGENTA);

		bt_findPass.setBounds(91,116,154,69);
		bt_findID.setBounds(308,116,163,69);
		setBounds(400,300,559,354);

		getContentPane().setLayout(null);
		
		getContentPane().add(bt_findPass);
		getContentPane().add(bt_findID);
		
		JButton bt_close = new JButton("닫기");
		bt_close.setFont(new Font("굴림", Font.PLAIN, 15));
		bt_close.setBackground(Color.RED);
		bt_close.setForeground(Color.WHITE);
		bt_close.setBounds(452, 266, 75, 27);
		getContentPane().add(bt_close);

		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// 생성자
	 
	 public static void main(String[] args) {
		new FindID();
	}
}// FindID

