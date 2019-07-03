package com.encore.coffee.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ForUpdate extends JFrame{
   public JTextField tf_id;
   public JPasswordField tf_pass;
   public JLabel la_id, la_pass;
   
   public JButton bt_login;

   public ForUpdate() {
      getContentPane().setBackground(Color.WHITE);
      setTitle("·Î±×ÀÎÆû");

      tf_id = new JTextField();
      tf_pass = new JPasswordField();
      bt_login = new JButton("·Î±×ÀÎ");
      bt_login.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
      bt_login.setBackground(Color.LIGHT_GRAY);

      la_id = new JLabel("I D");
      la_id.setForeground(Color.RED);
      la_id.setHorizontalAlignment(SwingConstants.CENTER);
      la_id.setFont(new Font("±¼¸²", Font.BOLD, 20));
      la_pass = new JLabel("Password");
      la_pass.setBackground(Color.LIGHT_GRAY);
      la_pass.setForeground(Color.RED);
      la_pass.setHorizontalAlignment(SwingConstants.CENTER);
      la_pass.setFont(new Font("±¼¸²", Font.BOLD, 20));
      
      tf_id.setBounds(278,42,218,77);
      tf_pass.setBounds(278,131,218,72);
      bt_login.setBounds(139,228,272,42);
      la_id.setBounds(61,47,181,67);
      la_pass.setBounds(61,136,172,67);
            
      setBounds(400,300,559,354);

      getContentPane().setLayout(null);
      getContentPane().add(tf_id);
      getContentPane().add(tf_pass);
      getContentPane().add(la_id);
      getContentPane().add(la_pass);
      getContentPane().add(bt_login);

      setVisible(false);
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }// »ý¼ºÀÚ

    public void showMsg(String msg) {
         JOptionPane.showMessageDialog(this, msg);
       }//showMsg

    public void initText() {
          tf_id.setText("");
          tf_pass.setText("");
          tf_id.requestFocus();
       }
   
}// ForUpdate