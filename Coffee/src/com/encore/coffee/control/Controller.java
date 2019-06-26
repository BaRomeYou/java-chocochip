package com.encore.coffee.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;

import com.encore.coffee.view.CardView;
import com.encore.coffee.view.CoffeeJoin;
import com.encore.coffee.view.MainView;
import com.encore.coffee.view.MemberUp;
import com.encore.coffee.view.coffeeloginView;
import com.encore.coffee.view.sell;
import com.encore.coffee.view.sell_g;
import com.encore.coffee.view.update;
import com.encore.coffee.view.order;

public class Controller implements ActionListener {
	
	MainView mainView;
	CoffeeJoin joinView;
	coffeeloginView loginView;
	MemberUp memberUp;
	sell_g sell_g;
	sell sell;
	update adminUp;
	order odr;
	CardView cardView;
	
	
	public Controller() {
		
		mainView = new MainView();
		joinView = new CoffeeJoin();
		loginView = new coffeeloginView();
		memberUp = new MemberUp();
		sell_g = new sell_g();
		sell = new sell();
		adminUp = new update();
		odr = new order();
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
		odr.button_18.addActionListener(this);
		odr.button_19.addActionListener(this);
		odr.button_20.addActionListener(this);
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
		cardView.btn_cancel.addActionListener(this);
		cardView.btn_confirm.addActionListener(this);
		
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
		
		Object obj = e.getSource();
	      if(obj==loginView.bt_join) {//회원가입 버튼 클릭
	         
	         
	      }else if(obj==loginView.bt_login) {//로그인 버튼 클릭
	         String id = loginView.tf_id.getText();
	         String pass = new String(loginView.tf_pass.getPassword());
	      }else if(obj==loginView.bt_findID) {//아이디, 비밀번호 찾기
	         
	      }else if(obj==joinView.bt_checkid) {//중복확인
	         
	      }else if(obj==joinView.bt_reset) {//취소
	         
	      }else if(obj==joinView.bt_submit) {//회원가입등록
	         
	      }else if(obj==memberUp.bt_checkid) {//회원정보수정(중복확인)
	         
	      }else if(obj==memberUp.bt_reset) {//회원정보수정(취소)
	         
	      }else if(obj==memberUp.bt_submit) {//회원정보수정(등록)
	         
	      }else if(obj==adminUp.btnNewButton) {//수정(확인)
	         
	      }else if(obj==adminUp.btnNewButton_1) {//수정(취소)
	    	
	    	  int row = odr.table.getSelectedRow();
	    	  if(row==-1)
	    	  	{ return; } 
	    	  else 
	    		  odr.table.remove(row);
	    	  
	         
	      }else if(obj==odr.button) {
	         
	      }else if(obj==odr.button_1) {
	         
	      }else if(obj==odr.button_2) {
	         
	      }else if(obj==odr.button_3) {
	         
	      }else if(obj==odr.button_4) {
	         
	      }else if(obj==odr.button_5) {
	         
	      }else if(obj==odr.button_6) {
	         
	      }else if(obj==odr.button_7) {
	         
	      }else if(obj==odr.button_8) {
	         
	      }else if(obj==odr.button_9) {
	         
	      }else if(obj==odr.button_10) {
	         
	      }else if(obj==odr.button_11) {
	         
	      }else if(obj==odr.button_12) {
	         
	      }else if(obj==odr.button_13) {
	         
	      }else if(obj==odr.button_14) {
	         
	      }else if(obj==odr.button_15) {
	         
	      }else if(obj==odr.button_16) {
	         
	      }else if(obj==odr.button_17) {
	         
	      }else if(obj==odr.button_18) {
	         
	      }else if(obj==odr.button_19) {
	         
	      }else if(obj==odr.button_20) {
	         
	      }else if(obj==odr.btnNewButton_2) {
	         
	      }else if(obj==odr.button_21) {
	         
	      }else if(obj==odr.button_22) {
	         
	      }else if(obj==odr.button_23) {
	         
	      }else if(obj==cardView.btn_confirm) {
	         
	      }else if(obj==cardView.btn_cancel) {
	         
	      }

		
		
	}
	
	public static void main(String[] args) {
		new Controller();
	}
	
	
}
