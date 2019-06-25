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
		String[] columTitle = {"�޴���", "����", "����"};
		dtm = new DefaultTableModel(rowData, columTitle);

		table = new JTable(dtm);
		scroll_table = new JScrollPane(table);

		frame = new JFrame();
		frame.setBounds(100, 150, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel la_card = new JLabel("�ֹ� ����Ʈ�� Ȯ�����ּ���.");
		la_card.setBounds(127, 12, 183, 18);
		frame.getContentPane().add(la_card);

		scroll_table.setBounds(31, 42, 369, 115);
		frame.getContentPane().add(scroll_table);
		
		// �÷��� �Բ� ���̺� ���� �����Ѵ�.
		DefaultTableModel dtm = new DefaultTableModel(rowData, columTitle);
		table = new JTable(dtm);
		table.setBounds(31, 42, 369, 116);
		frame.getContentPane().add(table);

		JButton btn_confirm = new JButton("Ȯ��");
		btn_confirm.setBounds(339, 190, 61, 27);
		frame.getContentPane().add(btn_confirm);

		JButton btn_cancel = new JButton("���");
		btn_cancel.setBounds(339, 218, 61, 27);
		frame.getContentPane().add(btn_cancel);
		
		MyDrawing md=new MyDrawing();
		md.setBounds(31, 180, 230, 80);
		frame.getContentPane().add(md);
		
		
		JLabel la_name = new JLabel("���� �� ������ �Է����ּ���");
		la_name.setBounds(31, 160, 210, 18);
		frame.getContentPane().add(la_name);
		
	}
}