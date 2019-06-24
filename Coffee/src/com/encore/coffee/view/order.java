package com.encore.coffee.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSpinner;

public class order extends JFrame {
	private JTextField txtJava;
	private DefaultTableModel model;
	

	
	public order() {
		setBackground(new Color(255, 255, 224));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 220));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 452, 83);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		String imgPath0="C:\\Users\\Playdata\\Desktop\\images\\logo2.png";
		ImageIcon icon0 = new ImageIcon(imgPath0);  
		
		Image img0=icon0.getImage();
		Image chainimg0=img0.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg0=new ImageIcon(chainimg0);
		
		
		
		btnNewButton.setIcon(chimg0);
		btnNewButton.setBounds(14, 15, 116, 58);
		btnNewButton.setBorder(new LineBorder(new Color(0,0,0)));
		panel_1.add(btnNewButton);
		
		txtJava = new JTextField();
		txtJava.setBackground(new Color(255, 255, 224));
		txtJava.setBorder(null);


		txtJava.setForeground(new Color(139, 0, 139));
		txtJava.setEditable(false);
		txtJava.setFont(new Font("한컴산뜻돋움", Font.ITALIC, 24));
		txtJava.setText("JaVa  ChocoChip Cafe");
		txtJava.setBounds(144, 29, 253, 24);
		panel_1.add(txtJava);
		txtJava.setColumns(10);
		
		
		
		String []col=new String[]{"번호","메뉴","가격","갯수"};
		
		
		 model = new DefaultTableModel(col,0);
		JTable table=new JTable(model);
		
		JScrollPane scrollPane=new JScrollPane(table);
		scrollPane.setEnabled(false);
		scrollPane.setLocation(0, 0);
		scrollPane.setSize(356, 182);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 224));
		panel_3.setBounds(0, 413, 356, 179);
		panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.add(scrollPane);
		
		
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 224));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(0, 593, 452, 35);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 0, 452, 35);
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\event1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 452, 35);
		panel_8.add(lblNewLabel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 224));
		tabbedPane.setBounds(0, 81, 452, 335);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(255, 255, 224));
		tabbedPane.addTab("커피메뉴", null, panel_2, null);
		panel_2.setLayout(null);
		
		
		 
		
		
		
		
		
		JButton button = new JButton("New button");
		button.setBackground(new Color(255, 255, 224));
		button.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		
		
		String imgPath="C:\\Users\\Playdata\\Desktop\\images\\Americano.jpg";
		ImageIcon icon1 = new ImageIcon(imgPath);  
		
		Image img1=icon1.getImage();
		Image chainimg1=img1.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg1=new ImageIcon(chainimg1);
		button.setIcon(chimg1);
		button.setBounds(0, 0, 155, 125);
		panel_2.add(button);
		
		
		
		
	
		
		JButton button_2 = new JButton("New button");
		button_2.setBackground(new Color(255, 255, 224));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		String imgPath2="C:\\Users\\Playdata\\Desktop\\images\\Caramel.jpg";
		ImageIcon icon2 = new ImageIcon(imgPath2); 
		Image img2=icon2.getImage();
		Image chainimg2=img2.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg2=new ImageIcon(chainimg2);
		button_2.setIcon(chimg2);
		button_2.setBounds(155, 0, 142, 125);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBackground(new Color(255, 255, 224));
		button_3.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		
		String imgPath3="C:\\Users\\Playdata\\Desktop\\images\\Capucino.jpg";
		ImageIcon icon3 = new ImageIcon(imgPath3); 
		Image img3=icon3.getImage();
		Image chainimg3=img3.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg3=new ImageIcon(chainimg3);
		button_3.setIcon(chimg3);
		button_3.setBounds(155, 126, 142, 125);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBackground(new Color(255, 255, 224));
		button_4.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		
		button_4.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\Latte.jpg"));
		button_4.setBounds(300, 0, 142, 125);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBackground(new Color(255, 255, 224));
		button_5.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		
		button_5.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\Dolchae.jpg"));
		button_5.setBounds(300, 126, 142, 125);
		panel_2.add(button_5);
		
		JButton button_1 = new JButton("New button");
		button_1.setBackground(new Color(255, 255, 224));
		button_1.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		
		String imgPath6="C:\\Users\\Playdata\\Desktop\\images\\Esprresso.jpg";
		ImageIcon icon6 = new ImageIcon(imgPath6); 
		Image img6=icon6.getImage();
		Image chainimg6=img6.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg6=new ImageIcon(chainimg6);
		button_1.setIcon(chimg6);
		button_1.setBounds(0, 126, 155, 125);
		panel_2.add(button_1);
		
		JLabel label = new JLabel("\uC544\uBA54\uB9AC\uCE74\uB178");
		label.setForeground(new Color(139, 0, 139));
		label.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label.setBackground(Color.WHITE);
		label.setBounds(39, 255, 81, 18);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("\uC5D0\uC2A4\uD504\uB808\uC18C");
		label_1.setForeground(new Color(139, 0, 139));
		label_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(39, 285, 81, 18);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("\uCE74\uB77C\uBA5C\uB77C\uB5BC");
		label_2.setForeground(new Color(139, 0, 139));
		label_2.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(185, 255, 81, 18);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("\uCE74\uD478\uCE58\uB178");
		label_3.setForeground(new Color(139, 0, 139));
		label_3.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(195, 285, 81, 18);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("\uCE74\uD398\uB77C\uB5BC");
		label_4.setForeground(new Color(139, 0, 139));
		label_4.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(333, 255, 81, 18);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("\uB3CC\uCCB4\uB77C\uB5BC");
		label_5.setForeground(new Color(139, 0, 139));
		label_5.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(333, 285, 81, 18);
		panel_2.add(label_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 224));
		panel_5.setLayout(null);
		tabbedPane.addTab("기타음료", null, panel_5, null);
		
		
		JButton button_6 = new JButton("New button");
		button_6.setBorder(new BevelBorder(BevelBorder.RAISED));
		String imgPath7="C:\\Users\\Playdata\\Desktop\\images\\BlackTea.jpg";
		ImageIcon icon7 = new ImageIcon(imgPath7); 
		Image img7=icon7.getImage();
		Image chainimg7=img7.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg7=new ImageIcon(chainimg7);
		button_6.setIcon(chimg7);
		
		
		button_6.setBounds(0, 0, 155, 125);
		panel_5.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBorder(new BevelBorder(BevelBorder.RAISED));
		String imgPath10="C:\\Users\\Playdata\\Desktop\\images\\GreenTea.jpg";
		ImageIcon icon10 = new ImageIcon(imgPath10); 
		Image img10=icon10.getImage();
		Image chainimg10=img10.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg10=new ImageIcon(chainimg10);
		
		button_7.setIcon(chimg10);
		button_7.setBounds(0, 126, 155, 125);
		panel_5.add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		String imgPath8="C:\\Users\\Playdata\\Desktop\\images\\coollime.jpg";
		ImageIcon icon8 = new ImageIcon(imgPath8); 
		Image img8=icon8.getImage();
		Image chainimg8=img8.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg8=new ImageIcon(chainimg8);
		button_8.setIcon(chimg8);
		button_8.setBounds(155, 0, 142, 125);
		panel_5.add(button_8);
		
		JButton button_9 = new JButton("New button");
		button_9.setBorder(new BevelBorder(BevelBorder.RAISED));
		String imgPath11="C:\\Users\\Playdata\\Desktop\\images\\Vanila.jpg";
		ImageIcon icon11 = new ImageIcon(imgPath11); 
		Image img11=icon11.getImage();
		Image chainimg11=img11.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg11=new ImageIcon(chainimg11);
		
		
		button_9.setIcon(chimg11);
		button_9.setBounds(155, 126, 142, 125);
		panel_5.add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		
		String imgPath9="C:\\Users\\Playdata\\Desktop\\images\\PinkJamong.jpg";
		ImageIcon icon9 = new ImageIcon(imgPath9); 
		Image img9=icon9.getImage();
		Image chainimg9=img9.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg9=new ImageIcon(chainimg9);
		
		
		button_10.setIcon(chimg9);
		button_10.setBounds(300, 0, 142, 125);
		panel_5.add(button_10);
		
		JButton button_11 = new JButton("New button");
		button_11.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		button_11.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\Javachip.jpg"));
		button_11.setBounds(300, 126, 142, 125);
		panel_5.add(button_11);
		
		JLabel label_6 = new JLabel("\uBE14\uB799\uD2F0");
		label_6.setForeground(new Color(139, 0, 139));
		label_6.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(46, 251, 81, 18);
		panel_5.add(label_6);
		
		JLabel label_7 = new JLabel("\uB179\uCC28\uD504\uB77C\uD478\uCE58\uB178");
		label_7.setForeground(new Color(139, 0, 139));
		label_7.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(14, 285, 113, 18);
		panel_5.add(label_7);
		
		JLabel label_8 = new JLabel("\uCFE8\uB77C\uC784\uD53C\uC9C0\uC624");
		label_8.setForeground(new Color(139, 0, 139));
		label_8.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(165, 251, 96, 18);
		panel_5.add(label_8);
		
		JLabel label_9 = new JLabel("\uBC14\uB2D0\uB77C\uD504\uB77C\uD478\uCE58\uB178");
		label_9.setForeground(new Color(139, 0, 139));
		label_9.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(155, 285, 127, 18);
		panel_5.add(label_9);
		
		JLabel label_10 = new JLabel("\uD551\uD06C\uC790\uBABD\uD53C\uC9C0\uC624");
		label_10.setForeground(new Color(139, 0, 139));
		label_10.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(310, 251, 105, 18);
		panel_5.add(label_10);
		
		JLabel label_11 = new JLabel("\uC790\uBC14\uCD08\uCF54\uCE69\uD504\uB77C\uD478\uCE58\uB178");
		label_11.setForeground(new Color(139, 0, 139));
		label_11.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(287, 285, 155, 18);
		panel_5.add(label_11);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 224));
		panel_6.setLayout(null);
		tabbedPane.addTab("베이커리", null, panel_6, null);
		
		JButton button_12 = new JButton("New button");
		
		button_12.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		button_12.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\blueberry.jpg"));
		button_12.setBounds(0, 0, 155, 125);
		panel_6.add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		button_13.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\banana.jpg"));
		button_13.setBounds(0, 126, 155, 125);
		panel_6.add(button_13);
		
		JButton button_14 = new JButton("New button");
		
		button_14.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\choco.jpg"));
		button_14.setBounds(155, 0, 142, 125);
		panel_6.add(button_14);
		
		JButton button_15 = new JButton("New button");
		button_15.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		button_15.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\redvelvet.jpg"));
		button_15.setBounds(155, 126, 142, 125);
		panel_6.add(button_15);
		
		JButton button_16 = new JButton("New button");
		button_16.setBorder(new BevelBorder(BevelBorder.RAISED));
		String imgPath16="C:\\Users\\Playdata\\Desktop\\images\\green.jpg";
		ImageIcon icon16 = new ImageIcon(imgPath16); 
		Image img16=icon16.getImage();
		Image chainimg16=img16.getScaledInstance(170, 120, Image.SCALE_SMOOTH);
		ImageIcon chimg16=new ImageIcon(chainimg16);
		
		
		
		
		button_16.setIcon(chimg16);
		button_16.setBounds(300, 0, 142, 125);
		panel_6.add(button_16);
		
		JButton button_17 = new JButton("New button");
		button_17.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		button_17.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\strawgreen.jpg"));
		button_17.setBounds(300, 126, 142, 125);
		panel_6.add(button_17);
		
		JLabel label_12 = new JLabel("\uBE14\uB8E8\uBCA0\uB9AC\uC2A4\uCF58");
		label_12.setForeground(new Color(139, 0, 139));
		label_12.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(14, 259, 97, 18);
		panel_6.add(label_12);
		
		JLabel label_13 = new JLabel("\uBC14\uB098\uB098\uCF00\uC774\uD06C");
		label_13.setForeground(new Color(139, 0, 139));
		label_13.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(14, 285, 97, 18);
		panel_6.add(label_13);
		
		JLabel label_14 = new JLabel("\uCD08\uCF54\uC2A4\uCF58");
		label_14.setForeground(new Color(139, 0, 139));
		label_14.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(179, 259, 97, 18);
		panel_6.add(label_14);
		
		JLabel label_15 = new JLabel("\uB808\uB4DC\uBCA8\uBCB3\uCF00\uC774\uD06C");
		label_15.setForeground(new Color(139, 0, 139));
		label_15.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(155, 285, 121, 18);
		panel_6.add(label_15);
		
		JLabel label_16 = new JLabel("\uB179\uCC28\uC2A4\uCF58");
		label_16.setForeground(new Color(139, 0, 139));
		label_16.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_16.setBackground(Color.WHITE);
		label_16.setBounds(325, 259, 97, 18);
		panel_6.add(label_16);
		
		JLabel label_17 = new JLabel("\uB538\uAE30\uB179\uCC28\uD06C\uB808\uC774\uD504");
		label_17.setForeground(new Color(139, 0, 139));
		label_17.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_17.setBackground(Color.WHITE);
		label_17.setBounds(300, 285, 122, 18);
		panel_6.add(label_17);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 248, 220));
		tabbedPane.addTab("토핑추가", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\drizzle.jpg"));
		btnNewButton_2.setBounds(14, 0, 205, 119);
		panel_7.add(btnNewButton_2);
		
		JButton button_21 = new JButton("New button");
		button_21.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_21.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\java.jpg"));
		button_21.setBounds(14, 131, 205, 119);
		panel_7.add(button_21);
		
		JButton button_22 = new JButton("New button");
		button_22.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_22.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\hazzel.jpg"));
		button_22.setBounds(242, 0, 205, 119);
		panel_7.add(button_22);
		
		JButton button_23 = new JButton("New button");
		button_23.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_23.setIcon(new ImageIcon("C:\\Users\\Playdata\\Desktop\\images\\ping.jpg"));
		button_23.setBounds(242, 131, 205, 119);
		panel_7.add(button_23);
		
		JLabel label_18 = new JLabel("\uCE74\uB77C\uBA5C\uB4DC\uB9AC\uC990");
		label_18.setForeground(new Color(139, 0, 139));
		label_18.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(64, 262, 99, 13);
		panel_7.add(label_18);
		
		JLabel label_19 = new JLabel("\uC790\uBC14\uCE69");
		label_19.setForeground(new Color(139, 0, 139));
		label_19.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_19.setBackground(Color.WHITE);
		label_19.setBounds(81, 284, 99, 13);
		panel_7.add(label_19);
		
		JLabel label_20 = new JLabel("\uD5E4\uC774\uC990\uB11B\uC2DC\uB7FD");
		label_20.setForeground(new Color(139, 0, 139));
		label_20.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(291, 260, 99, 13);
		panel_7.add(label_20);
		
		JLabel label_21 = new JLabel("\uD718\uD551\uD06C\uB9BC");
		label_21.setForeground(new Color(139, 0, 139));
		label_21.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		label_21.setBackground(Color.WHITE);
		label_21.setBounds(313, 284, 99, 13);
		panel_7.add(label_21);
		
		JButton btnNewButton_1 = new JButton("\uC120\uD0DD\uCDE8\uC18C");
		
		
		
		
		btnNewButton_1.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(255, 255, 224));
		btnNewButton_1.setBounds(352, 413, 100, 35);
		panel.add(btnNewButton_1);
		
		
		JButton button_18 = new JButton("\uC804\uCCB4\uCDE8\uC18C");
		button_18.setBackground(new Color(255, 255, 224));
		button_18.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		button_18.setBounds(352, 448, 100, 35);
		panel.add(button_18);
		
		JButton button_19 = new JButton("\uB9E4\uC7A5\uC5D0\uC11C\uACB0\uC81C");
		
		
		button_19.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		button_19.setBackground(new Color(255, 255, 224));
		button_19.setBounds(352, 481, 100, 35);
		panel.add(button_19);
		
		JButton button_20 = new JButton("\uCE74\uB4DC\uACB0\uC81C");
		button_20.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		button_20.setBackground(new Color(255, 255, 224));
		button_20.setBounds(352, 514, 100, 35);
		panel.add(button_20);
		
		JLabel lblNewLabel = new JLabel("\uC218\uB7C9\uC120\uD0DD");
		lblNewLabel.setFont(new Font("한컴 고딕", Font.PLAIN, 11));
		lblNewLabel.setBounds(376, 549, 62, 18);
		panel.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(370, 568, 54, 24);
		panel.add(spinner);
		
		setVisible(true);
		setSize(445, 675);
		
	}

	
	
	
	public static void main(String[] args) {
		new order();
	}
}
