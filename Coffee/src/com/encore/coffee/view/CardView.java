package com.encore.coffee.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.encore.coffee.model.productVO;

import javax.swing.JTextField;

public class CardView  {

   public JFrame frame;
   public JTable table;
   public DefaultTableModel dtm;
   public JScrollPane scroll_table;
   public JTextField textField;
   /**
    * Launch the application.
    */
   public JButton btn_cancel;
   public JButton btn_confirm;
   public JLabel lblNewLabel,lblNewLabel_1,la_card;
   public MyDrawing md;

   /**
    * Create the application.
    */
   public CardView() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      Object[][] rowData = new Object[0][3];
      String[] columTitle = {"메뉴명", "가격", "수량"};
      dtm = new DefaultTableModel(rowData, columTitle);

      table = new JTable(dtm);
      scroll_table = new JScrollPane(table);

      frame = new JFrame();
      frame.setBounds(100, 150, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

       la_card = new JLabel("Ordered List");
      la_card.setBounds(31, 12, 88, 18);
      frame.getContentPane().add(la_card);

      scroll_table.setBounds(31, 42, 369, 103);
      frame.getContentPane().add(scroll_table);
      
      
      
      
       lblNewLabel_1 = new JLabel("총주문금액:");
      lblNewLabel_1.setBounds(250, 12, 76, 18);
      frame.getContentPane().add(lblNewLabel_1);

      
      textField = new JTextField();
      textField.setBounds(320, 12, 80, 24);
      textField.setEnabled(false);
      frame.getContentPane().add(textField);
      textField.setColumns(10);
   
      
      
      
       btn_confirm = new JButton("확인");
      btn_confirm.setBounds(339, 190, 61, 27);
      frame.getContentPane().add(btn_confirm);

       btn_cancel = new JButton("취소");
      btn_cancel.setBounds(339, 218, 61, 27);
      frame.getContentPane().add(btn_cancel);
      
       md=new MyDrawing();
      md.setBounds(31, 169, 304, 76);
      frame.getContentPane().add(md);
      
       lblNewLabel = new JLabel("Signature");
      lblNewLabel.setBounds(182, 150, 62, 18);
      frame.getContentPane().add(lblNewLabel);
      
   }

   
public int sumPrice() { // 카드결제 뷰 텍스트필드출력
      
      int sumP=0;
      
      for(int i=0;i<table.getModel().getRowCount();i++) {
         sumP+=(Integer)table.getModel().getValueAt(i, 1)*(Integer)table.getModel().getValueAt(i, 2);
      }
      return sumP;
   }
   


public void displayTable(productVO pvo) {
   
   
   Object []rowData= {pvo.getMenu(),pvo.getPrice(),pvo.getQuantity()};
   
   
   dtm.addRow(rowData);
   

   
}   


}