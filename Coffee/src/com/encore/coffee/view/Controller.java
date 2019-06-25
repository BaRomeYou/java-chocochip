package com.encore.coffee.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;

import com.encore.coffee.view.CoffeeJoin;
import com.encore.coffee.view.MainView;
import com.encore.coffee.view.MemberUp;
import com.encore.coffee.view.coffeeloginView;
import com.encore.coffee.view.sell;
import com.encore.coffee.view.sell_g;
import com.encore.coffee.view.update;


public class Controller implements ActionListener {
	
	MainView mainView;
	CoffeeJoin joinView;
	coffeeloginView loginView;
	MemberUp memberUp;
	sell_g sell_g;
	sell sell;
	update adminUp;
	order odr;
	
	
	public Controller() {
		
		mainView = new MainView();
		joinView = new CoffeeJoin();
		loginView = new coffeeloginView();
		memberUp = new MemberUp();
		sell_g = new sell_g();
		sell = new sell();
		adminUp = new update();
		odr=new order();
		eventUp();
	}
	
	public void eventUp() {
		//CoffeeJoin
		joinView.bt_checkid.addActionListener(this);
		joinView.bt_reset.addActionListener(this);
		joinView.bt_submit.addActionListener(this);
		
		//coffeeloginView
		loginView.bt_findID.addActionListener(this);
		loginView.bt_join.addActionListener(this);
		loginView.bt_login.addActionListener(this);
		
		//MemberUp();
		memberUp.bt_checkid.addActionListener(this);
		memberUp.bt_reset.addActionListener(this);
		memberUp.bt_submit.addActionListener(this);
		
		//sell_g
		
		//sell
		sell.btn.addActionListener(this);
		sell.btnDw.addActionListener(this);
		sell.btnGr.addActionListener(this);
		
		//update
		adminUp.btnNewButton.addActionListener(this);
		adminUp.btnNewButton_1.addActionListener(this);
		
		//order
		
		odr.btnNewButton_2.addActionListener(this);
		odr.btnNewButton_3.addActionListener(this);
		odr.button.addActionListener(this);
		odr.button_1.addActionListener(this);
		odr.button_10.addActionListener(this);
		odr.button_11.addActionListener(this);
		odr.button_12.addActionListener(this);
		odr.button_13.addActionListener(this);
		odr.button_14.addActionListener(this);
		odr.button_15.addActionListener(this);
		odr.button_16.addActionListener(this);
		odr.button_17.addActionListener(this);
		odr.button_2.addActionListener(this);
		odr.button_21.addActionListener(this);
		odr.button_22.addActionListener(this);
		odr.button_23.addActionListener(this);
		odr.button_3.addActionListener(this);
		odr.button_4.addActionListener(this);
		odr.button_5.addActionListener(this);
		odr.button_6.addActionListener(this);
		odr.button_7.addActionListener(this);
		odr.button_8.addActionListener(this);
		odr.button_9.addActionListener(this);
		
	}
	
	//로그인 버튼눌러서 회원정보가 확인되어서 order뷰가 뜰때 pop창에 생성되야할 클래스
	class Pop extends Thread{
		 public void run() {
			 int num=1;
			 int P=0;
			 Calendar cal=Calendar.getInstance();
			 String sec=null;
			 String[] picture= {"event1","event2","event3"};
			 
			 while(true) {
				 
				 try {
					sec=(cal.get(Calendar.SECOND)<10?"0":"")+cal.get(Calendar.SECOND);
					 
					 sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 num++;
				 
				 if(num%5==0) {
					 if(P<5) {
						 P++;
						 
						 if(P==5) {
							 P=0;
							 
						 }
						 
						 odr.lblNewLabel_1.setIcon(new ImageIcon(order.class.getResource("../images/"+picture[P]+".jpg")));
					 }
					 
				 }
				 
				 
			 }
			 
		 }
		
		
		
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public static void main(String[] args) {
		new Controller();
	}
	
	
}
