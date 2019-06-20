package com.encore.coffree.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTabbedPane;
 class gg extends JFrame{
	
}

public class sell_g extends JFrame {
	gg gg;
	JPanel p1,p2,p3;
	private JPanel contentPane;
	int ham[]=new int[6];
	 
	 public void paint(Graphics g) {
		
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawLine(50, 350, 700, 350);
			for (int i = 0;  i< ham.length; i++) {
				g.drawString(i*10+"", 25,355-40*i);
				g.drawLine(50, 350-40*i, 700, 350-40*i);
			}
			g.drawLine(50, 100, 50, 350);
		}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sell_g frame = new sell_g();
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
	public sell_g() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(14, 24, 710, 325);
		tabbedPane.add("目乔",p1 =new JPanel());
		tabbedPane.add("澜丰",p2=new JPanel());
		tabbedPane.add("海捞目府",p3=new JPanel());
		contentPane.add(tabbedPane);
		
		
	}
}
