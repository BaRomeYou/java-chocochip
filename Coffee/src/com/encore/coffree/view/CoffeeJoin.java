package com.encore.coffree.view;
	
	import java.awt.Font;

	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;

	public class CoffeeJoin extends JFrame{
	    public JTextField tf_id, tf_name, tf_ssn1, tf_ssn3, tf_phone1, tf_phone2, tf_phone3, tf_email;
	      public JPasswordField tf_pass, tf_pass2;
	      public JButton bt_submit, bt_reset, bt_checkid;
	      public JComboBox<String> cb_gender, cb_ssn2, cb_email;
	             JLabel [] label;
	      public JLabel la_year, la_month, la_day;
	      
	      public CoffeeJoin() {
	        setTitle("회원가입");
	        
	        tf_id = new JTextField();
	        tf_name = new JTextField();
	        tf_ssn1 = new JTextField();
	        la_year = new JLabel("년");
	        tf_ssn3 = new JTextField();
	        la_day = new JLabel("일"); 
	        tf_phone1 = new JTextField();
	        tf_phone2 = new JTextField();
	        tf_phone3 = new JTextField();
	        tf_email = new JTextField();
	        
	        tf_pass = new JPasswordField();
	        tf_pass2 = new JPasswordField();
	        
	        bt_submit = new JButton("등록");
	        bt_reset = new JButton("취소");
	        bt_checkid = new JButton("중복확인");
	        
	        String []gender= {"여성","남성","기타"};
	        String []month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	          String []email = {"직접입력", "gmail.com", "daum.net", "naver.com"};
	        
	        cb_ssn2 = new JComboBox<String>(month);
	        la_month= new JLabel("월");
	        cb_gender = new JComboBox<String>(gender);
	        cb_email = new JComboBox<String>(email);
	        
	        //----------------------JLabel생성-------------------------------------
	        String []labelTitle= {"I  D","비  번","비번확인","이  름","생년월일",
	              "전화번호","Email","성  별","-","-"};
	        label = new JLabel[labelTitle.length];
	        
	        for (int i = 0; i < labelTitle.length; i++) {
	          if(i<8)
	           label[i] = new JLabel(labelTitle[i]+":");
	          else
	           label[i] = new JLabel(labelTitle[i]);
	        }
	        
	        tf_id.setBounds(80,30,100,25);
	        tf_pass.setBounds(80,70,100,25);
	        tf_pass2.setBounds(80,110,100,25);
	        tf_name.setBounds(80,150,100,25);
	        
	        tf_ssn1.setBounds(80,190,40,25);
	          la_year.setBounds(121, 190, 13,25);
	        cb_ssn2.setBounds(140,190,40,25);
	          la_month.setBounds(181, 190, 13,25);
	        tf_ssn3.setBounds(200,190,40,25);
	          la_day.setBounds(241, 190, 13,25);
	         
	        tf_phone1.setBounds(80,230,40,25);
	          label[8].setBounds(121, 230, 8,25);
	        tf_phone2.setBounds(130,230,40,25);
	          label[9].setBounds(171, 230, 8,25);
	        tf_phone3.setBounds(180,230,40,25);
	        
	        tf_email.setBounds(80,270,100,25);
	        cb_email.setBounds(190,270,80,25);
	        cb_gender.setBounds(80,310,100,25);
	        
	        bt_submit.setBounds(50,360,90,25);
	        bt_reset.setBounds(150,360,90,25);
	        bt_checkid.setBounds(190,30,90,25);

	        
	        setLayout(null);
	        
	        int y=30;
	        for (int i = 0; i < label.length-2; i++) {
	           label[i].setBounds(10, y, 100, 25);
	           add(label[i]);
	           y+=40;
	        }
	        
	        add(label[8]);
	        add(label[9]);
	        add(la_year);
	        add(la_month);
	        add(la_day);
	        
	        add(tf_id);
	        add(tf_pass);
	        add(tf_pass2);
	        add(tf_name);
	        add(tf_ssn1);
	        add(cb_ssn2);
	        add(tf_ssn3);
	        add(tf_phone1);
	        add(tf_phone2);
	        add(tf_phone3);
	        add(tf_email);
	        
	        add(cb_email);
	        add(cb_gender);
	        
	        add(bt_submit);
	        add(bt_reset);
	        add(bt_checkid);
	        
	        setBounds(350,200,450,450);
	        setVisible(true);
	      }//생성자
	      
	      public static void main(String[] args) {
	          new CoffeeJoin();
	      }
	      
	   }//CoffeeJoin

