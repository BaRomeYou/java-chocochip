package com.encore.coffee.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;

public class CashView {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel dtm;
	private JScrollPane scroll_table;
	public JButton btn_confirm, btn_cancel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashView window = new CashView();
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
	public CashView() {
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("주문 리스트를 확인해주세요.");
		lblNewLabel.setBounds(127, 12, 183, 18);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("지급한 돈:");
		lblNewLabel_1.setBounds(60, 49, 76, 18);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(166, 46, 116, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("원");
		lblNewLabel_2.setBounds(288, 49, 62, 18);
		frame.getContentPane().add(lblNewLabel_2);

		scroll_table.setBounds(31, 92, 369, 115);
		frame.getContentPane().add(scroll_table);

		btn_confirm = new JButton("확인");
		btn_confirm.setBounds(95, 214, 105, 27);
		frame.getContentPane().add(btn_confirm);

		btn_cancel = new JButton("취소");
		btn_cancel.setBounds(205, 214, 105, 27);
		frame.getContentPane().add(btn_cancel);
	}
}
