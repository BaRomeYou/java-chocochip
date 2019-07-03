package com.encore.coffee.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LookPass extends JFrame {
   public JTextField tf_name, tf_id, tf_email;
   public JLabel la_name, la_id, la_email;
   public JButton bt_find, bt_back;

   public LookPass() {
      setTitle("비번찾기");

      tf_name = new JTextField();
      tf_id = new JTextField();
      tf_email = new JTextField();

      la_name = new JLabel("이름");
      la_id = new JLabel("I D");
      la_email = new JLabel("email");

      bt_find = new JButton("찾기");
      bt_back = new JButton("되돌아가기");

      tf_name.setBounds(150, 30, 200, 40);
      la_name.setBounds(70, 30, 80, 40);

      tf_id.setBounds(150, 90, 200, 40);
      la_id.setBounds(70, 90, 80, 40);

      tf_email.setBounds(150, 150, 200, 40);
      la_email.setBounds(70, 150, 200, 40);

      bt_find.setBounds(130, 220, 100, 30);
      bt_back.setBounds(270, 220, 100, 30);

      add(tf_name);
      add(tf_id);
      add(tf_email);
      add(la_email);
      add(la_name);
      add(la_id);
      add(bt_find);
      add(bt_back);

      setLayout(null);
      setBounds(400, 300, 500, 354);
      setVisible(false);
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

}// LookPass