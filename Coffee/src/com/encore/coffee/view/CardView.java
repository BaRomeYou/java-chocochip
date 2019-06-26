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
import javax.swing.JTextField;

public class CardView extends JFrame {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel dtm;
	private JScrollPane scroll_table;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public JButton btn_cancel;
	public JButton btn_confirm;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardView window = new CardView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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

		JLabel la_card = new JLabel("Ordered List");
		la_card.setBounds(175, 12, 88, 18);
		frame.getContentPane().add(la_card);

		scroll_table.setBounds(31, 42, 369, 103);
		frame.getContentPane().add(scroll_table);
		
		// 컬럼과 함께 테이블 모델을 지정한다.
		DefaultTableModel dtm = new DefaultTableModel(rowData, columTitle);
		table = new JTable(dtm);
		table.setBounds(31, 42, 369, 93);
		frame.getContentPane().add(table);

		JButton btn_confirm = new JButton("확인");
		btn_confirm.setBounds(339, 190, 61, 27);
		frame.getContentPane().add(btn_confirm);

		JButton btn_cancel = new JButton("취소");
		btn_cancel.setBounds(339, 218, 61, 27);
		frame.getContentPane().add(btn_cancel);
		
		MyDrawing md=new MyDrawing();
		md.setBounds(31, 169, 304, 76);
		frame.getContentPane().add(md);
		
		JLabel lblNewLabel = new JLabel("Signature");
		lblNewLabel.setBounds(182, 147, 62, 18);
		frame.getContentPane().add(lblNewLabel);
		
	}

}