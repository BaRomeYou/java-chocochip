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

public class coffeeloginView extends JFrame{
   public JTextField tf_id;
   public JPasswordField tf_pass;
   public JLabel la_id, la_pass;
   
   public JButton bt_login, bt_perInfo, bt_join, bt_findID;

   public coffeeloginView() {
      getContentPane().setForeground(new Color(0, 0, 0));
      getContentPane().setBackground(new Color(153, 204, 255));
      setTitle("로그인폼");

      tf_id = new JTextField();
      tf_pass = new JPasswordField();
      bt_login = new JButton("로그인");
      bt_login.setFont(new Font("돋움", Font.BOLD, 15));
      bt_login.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
      bt_login.setBackground(new Color(255, 204, 153));
      bt_perInfo = new JButton("회원정보수정");
      bt_perInfo.setFont(new Font("돋움", Font.BOLD, 15));
      bt_perInfo.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
      bt_perInfo.setBackground(new Color(255, 204, 153));
      bt_join = new JButton("회원가입");
      bt_join.setFont(new Font("돋움", Font.BOLD, 15));
      bt_join.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
      bt_join.setBackground(new Color(255, 204, 153));
      bt_findID = new JButton("아이디/비번찾기");
      bt_findID.setFont(new Font("돋움", Font.BOLD, 15));
      bt_findID.setBackground(new Color(255, 204, 153));
      bt_findID.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));

      la_id = new JLabel("I D");
      la_id.setForeground(new Color(102, 0, 51));
      la_id.setHorizontalAlignment(SwingConstants.CENTER);
      la_id.setFont(new Font("Segoe UI Emoji", la_id.getFont().getStyle(), la_id.getFont().getSize() + 15));
      la_pass = new JLabel("Password");
      la_pass.setBackground(Color.LIGHT_GRAY);
      la_pass.setForeground(new Color(102, 0, 51));
      la_pass.setHorizontalAlignment(SwingConstants.CENTER);
      la_pass.setFont(new Font("Segoe UI Emoji", la_pass.getFont().getStyle(), la_pass.getFont().getSize() + 15));
      
      tf_id.setBounds(256,42,218,61);
      tf_pass.setBounds(256,115,218,61);
      bt_login.setBounds(14,236,100,49);
      bt_perInfo.setBounds(256,236,100,49);      
      bt_join.setBounds(133,236,100,49);
      bt_findID.setBounds(370,236,169,49);
      la_id.setBounds(49,42,181,55);
      la_pass.setBounds(61,121,172,55);
            
      setBounds(400,300,559,354);

      getContentPane().setLayout(null);
      getContentPane().add(tf_id);
      getContentPane().add(tf_pass);
      getContentPane().add(la_id);
      getContentPane().add(la_pass);
      getContentPane().add(bt_login);
      getContentPane().add(bt_perInfo);
      getContentPane().add(bt_join);
      getContentPane().add(bt_findID);

      setVisible(true);
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }// 생성자

    public void showMsg(String msg) {
         JOptionPane.showMessageDialog(this, msg);
       }//showMsg

    public void initText() {
          tf_id.setText("");
          tf_pass.setText("");
          tf_id.requestFocus();
       }
   
}// LoginForm