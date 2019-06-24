package com.encore.coffee.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	
	public Controller() {
		
		mainView = new MainView();
		joinView = new CoffeeJoin();
		loginView = new coffeeloginView();
		memberUp = new MemberUp();
		sell_g = new sell_g();
		sell = new sell();
		adminUp = new update();
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
		
	}
	
	
	public static void main(String[] args) {
		new Controller();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
