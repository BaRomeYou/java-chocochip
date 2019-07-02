package com.encore.coffee.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LookID extends JFrame {
   public JTextField tf_name, tf_email;
   public JComboBox<Object> cb_year, cb_day;
   public JComboBox<String> cb_month;
   public JLabel la_name, la_birth, la_year, la_month, la_day, la_email;
   public JButton bt_find, bt_back;

   public LookID() {
      setTitle("아이디찾기");

      tf_name = new JTextField();
      cb_year = new JComboBox<Object>();

      String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
      cb_month = new JComboBox<String>(month);

      cb_day = new JComboBox<Object>();
      tf_email = new JTextField();

      for (int i = 1; i <= 31; i++)
         cb_day.addItem(i);
      for (int i = 2019; i > 1970; i--)
         cb_year.addItem(i);

      la_name = new JLabel("이름");
      la_birth = new JLabel("생년월일");
      la_year = new JLabel("년");
      la_month = new JLabel("월");
      la_day = new JLabel("일");
      la_email = new JLabel("email");

      bt_find = new JButton("찾기");
      bt_back = new JButton("되돌아가기");

      tf_name.setBounds(150, 30, 150, 25);
      la_name.setBounds(70, 30, 80, 25);
      la_birth.setBounds(70, 70, 80, 25);
      cb_year.setBounds(150, 70, 80, 25);
      la_year.setBounds(240, 70, 13, 25);
      cb_month.setBounds(265, 70, 50, 25);
      la_month.setBounds(325, 70, 13, 25);
      cb_day.setBounds(345, 70, 50, 25);
      la_day.setBounds(405, 70, 13, 25);
      tf_email.setBounds(150, 110, 250, 25);
      la_email.setBounds(70, 110, 200, 25);

      bt_find.setBounds(150, 150, 100, 30);
      bt_back.setBounds(270, 150, 100, 30);

      add(tf_name);
      add(cb_year);
      add(cb_month);
      add(tf_email);
      add(la_email);
      add(cb_day);
      add(la_name);
      add(la_year);
      add(la_month);
      add(la_day);
      add(la_birth);
      add(bt_find);
      add(bt_back);

      setLayout(null);
      setBounds(400, 300, 500, 354);
      setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

}// LookID