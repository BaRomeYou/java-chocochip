package com.encore.coffee.control;

import com.encore.coffee.view.CoffeeJoin;
import com.encore.coffee.view.MainView;
import com.encore.coffee.view.MemberUp;
import com.encore.coffee.view.coffeeloginView;
import com.encore.coffee.view.sell;
import com.encore.coffee.view.sell_g;
import com.encore.coffee.view.update;


public class Controller {
	
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
		
	}
	
	
	public static void main(String[] args) {
		new Controller();
	}
}
