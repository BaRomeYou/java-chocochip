package com.encore.coffee.view;
   
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CoffeeJoin extends JFrame{
      public JTextField tf_id, tf_name, tf_phone1, tf_phone2, tf_phone3, tf_email;
      public JPasswordField tf_pass, tf_pass2;
      public JButton bt_submit, bt_reset, bt_checkid;
      public JComboBox<String> cb_gender, cb_month, cb_email;
      JLabel [] label;
      public JComboBox<Object> cb_year, cb_date;
      public JLabel la_year, la_month, la_day;
      
      public CoffeeJoin() {
        setTitle("회원가입");
        
        tf_id = new JTextField();
        tf_name = new JTextField();
        la_year = new JLabel("년");
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
        String []email = {"==선택==", "직접입력", "@gmail.com", "@daum.net", "@naver.com"};

        cb_month = new JComboBox<String>(month);
        la_month= new JLabel("월");
        cb_gender = new JComboBox<String>(gender);
        cb_email = new JComboBox<String>(email);
        cb_year = new JComboBox();
        cb_date = new JComboBox();           
        for(int i=1;i<=31;i++) 
           cb_date.addItem(i);
        for(int i=2019;i>1970;i--)
           cb_year.addItem(i);
           
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
        
        cb_year.setBounds(80,190,80,25);
          la_year.setBounds(165,190,13,25);
        cb_month.setBounds(181,190,40,25);
          la_month.setBounds(225, 190, 13,25);
        cb_date.setBounds(241,190,40,25);
          la_day.setBounds(285, 190, 13,25);
         
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
        add(cb_year);
        add(cb_month);
        add(cb_date);
        add(tf_phone1);
        add(tf_phone2);
        add(tf_phone3);
        add(tf_email);
        
        add(cb_email);
        add(cb_gender);
        
        add(bt_submit);
        add(bt_reset);
        add(bt_checkid);
        
        setBounds(350,200,450,480);
        setVisible(false);
      }//생성자
      
      
     public void showMSG(String msg) {
         
         JOptionPane.showMessageDialog(this, msg);
         
      }
      
      
   }//CoffeeJoin