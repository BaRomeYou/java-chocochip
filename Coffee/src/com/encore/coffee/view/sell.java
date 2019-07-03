package com.encore.coffee.view;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.encore.coffee.model.memberVO;
import com.encore.coffee.model.productVO;

public class sell extends JFrame {
   JPanel p1, p2;
   private JPanel contentPane;
   private JLabel lblNewLabel;
   private JTextField textField;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               sell frame = new sell();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   DefaultTableModel dtm, dtm2;
   public JTable table, table2;
   JScrollPane scroll_table, scroll_table2;
   public JButton btnDw,bt_mem;
   public JButton btnGr;
   private JTextField textField_1;
   private JTextField textField_2;
   public JComboBox comboBox, comboBox2;

   public sell() {

      Object[][] rowData = new Object[0][4];
      String[] columTitle = { "NO", "메뉴명", "가격", "수량" };
      dtm = new DefaultTableModel(rowData, columTitle);

      table = new JTable(dtm);
      scroll_table = new JScrollPane(table);

      Object[][] rowData2 = new Object[0][8];
      String[] columTitle2 = { "번호", "이름", "아이디", "비밀번호", "생일", "성별", "전화번호", "메일","사용횟수" };
      dtm2 = new DefaultTableModel(rowData2, columTitle2);

      table2 = new JTable(dtm2);
      scroll_table2 = new JScrollPane(table2);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 635, 524);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

      JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
      tabbedPane.setBounds(14, 24, 574, 425);
      tabbedPane.add("회원관리", p1 = new JPanel());
      tabbedPane.add("판매관리", p2 = new JPanel());
      p2.setLayout(null);
      p1.setLayout(null);

      lblNewLabel = new JLabel("총수입");
      lblNewLabel.setBounds(14, 185, 62, 18);
      p2.add(lblNewLabel);

      scroll_table.setBounds(131, 53, 424, 328);
      p2.add(scroll_table);

      scroll_table2.setBounds(131, 53, 424, 328);
      p1.add(scroll_table2);

      textField = new JTextField();
      textField.setBounds(57, 182, 62, 24);
      p2.add(textField);
      textField.setColumns(10);
      textField.setEnabled(false);
      btnDw = new JButton("검색");
      btnDw.setBounds(280, 14, 105, 27);
      p2.add(btnDw);

      btnGr = new JButton("그래프 보기");
      btnGr.setBounds(412, 14, 128, 27);
      p2.add(btnGr);

      String[] str = new String[] { "커피", "음료", "베이커리" };

      comboBox = new JComboBox(str);
      comboBox.setBounds(131, 15, 105, 24);
      p2.add(comboBox);

      String[] str2 = new String[] { "번호", "이름", "아이디", "비밀번호", "생일", "성별", "전화번호", "메일"};

      comboBox2 = new JComboBox(str2);
      comboBox2.setBounds(131, 15, 105, 24);
      p1.add(comboBox2);

      JLabel label = new JLabel("총인원");
      label.setBounds(14, 185, 62, 18);
      p1.add(label);

      textField_1 = new JTextField();
      textField_1.setColumns(10);
      textField_1.setBounds(57, 182, 62, 24);
      textField_1.setEnabled(false);
      p1.add(textField_1);

      bt_mem = new JButton("검색");
      bt_mem.setBounds(396, 14, 105, 27);
      p1.add(bt_mem);

      textField_2 = new JTextField();
      textField_2.setBounds(250, 15, 125, 24);
      p1.add(textField_2);
      textField_2.setColumns(10);

      contentPane.add(tabbedPane);
      setVisible(false);
   }

   public Map<String, String> memberSearch() {
      String keyword = textField_2.getText();
      String title = comboBox2.getSelectedItem().toString() ;
      if(title=="번호") {
            keyword = keyword.toString();
      }

      Map<String, String> map = new HashMap<String, String>();
      map.put("keyword", keyword);
      map.put("title", title);
      return map;
   }
   
   public Map<String,String> productSearch(){
      String keyword = "";
      String title = comboBox.getSelectedItem().toString();
      if(title.equals("커피")) {
         keyword = "1"; 
      }else if (title.equals("음료")) {
         keyword = "2";
      }else if (title.equals("베이커리")) {
         keyword = "3";
      }
      
      Map<String, String> map = new HashMap<String, String>();
      map.put("keyword", keyword);
      map.put("title", title);
      return map;
   }
   public void displayTable(ArrayList<memberVO> list) {
      
      dtm2.setRowCount(0);

      for (int i = 0; i < list.size(); i++) {
         memberVO vo = list.get(i);

      Object[] rowData = { vo.getNo(), vo.getName(), vo.getId(), vo.getPwd(), vo.getBirth(),
               vo.getGender(), vo.getPhone(), vo.getMail(), vo.getFreq()};
      
         dtm2.addRow(rowData);
      }
      
      
      }
   public void displayProductTable (ArrayList<productVO> list) {
      
      dtm.setRowCount(0);
      for (int i = 0; i < list.size(); i++) {
         productVO vo = list.get(i);
         
         Object[] rowData = { vo.getMenu_id(), vo.getMenu(), vo.getPrice(), vo.getQuantity()
               
         };
         
         dtm.addRow(rowData);
         
      }

   }//displayTable
   
}