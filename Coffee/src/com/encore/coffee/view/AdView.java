package com.encore.coffee.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AdView {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdView window = new AdView();
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
	public AdView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(32, 23, 96, 139);
		frame.getContentPane().add(tabbedPane);
		
		tabbedPane.add("±¤°í5", new JPanel());
		tabbedPane.add("±¤°í4", new JPanel());
		tabbedPane.add("±¤°í3", new JPanel());
		tabbedPane.add("±¤°í2", new JPanel());
		tabbedPane.add("±¤°í1", new JPanel());
		
		JButton btn_cancel = new JButton("Cancel");
		btn_cancel.setBounds(313, 370, 105, 27);
		frame.getContentPane().add(btn_cancel);
		
		JLabel lblNewLabel = new JLabel("Photo");
		lblNewLabel.setBounds(135, 29, 283, 329);
		frame.getContentPane().add(lblNewLabel);
	}
}
