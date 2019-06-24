package com.encore.coffee.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LookID extends JFrame {
	public JTextField tf_name, tf_ssn1, tf_ssn3, tf_email;	
	public JComboBox<String> cb_ssn2;
    public JLabel la_name, la_ssn1, la_ssn2, la_ssn3, la_ssn4, la_email;
    public JButton bt_find, bt_back; 
  
    
public LookID() {
	setTitle("아이디찾기");
	 
	 tf_name = new JTextField();
	 tf_ssn1 = new JTextField();
	 
	 String []month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	 cb_ssn2 = new JComboBox<String>(month);
	 
	 tf_ssn3 = new JTextField();
	 tf_email = new JTextField();
	 
	 la_name = new JLabel("이름");
	 la_ssn1 = new JLabel("생년원일");
	 la_ssn2 = new JLabel("년");
	 la_ssn3 = new JLabel("월");
	 la_ssn4 = new JLabel("일");
	 la_email = new JLabel("email");
	 
	 bt_find = new JButton("찾기");
	 bt_back = new JButton("되돌아가기");
	 
	 
	 tf_name.setBounds(150,30,150,25);
	 la_name.setBounds(70,30,80,25);
	 la_ssn1.setBounds(70,70,80,25);
	 tf_ssn1.setBounds(150,70,50,25);
	 la_ssn2.setBounds(205,70,13,25);
	 cb_ssn2.setBounds(250,70,50,25);
	 la_ssn3.setBounds(305,70,13,25);
	 tf_ssn3.setBounds(350,70,50,25);
	 la_ssn4.setBounds(405,70,13,25);
	 tf_email.setBounds(150,110,250,25);
	 la_email.setBounds(70,110,200,25);
	 
	 bt_find.setBounds(150,150,100,30);
	 bt_back.setBounds(270,150,100,30);
	 	 
	 add(tf_name);
	 add(tf_ssn1);
	 add(tf_ssn3);
	 add(tf_email);
	 add(la_email);
	 add(cb_ssn2);
	 add(la_name);
	 add(la_ssn1);
	 add(la_ssn2);
	 add(la_ssn3);
	 add(la_ssn4);
	 add(bt_find);
	 add(bt_back);
	  
	 setLayout(null);
	 setBounds(400,300,500,354);
	 setVisible(true);
	 setResizable(false);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
}
 public static void main(String[] args) {
	new LookID();
}    
    
}//LookID
