package com.encore.coffee.model;

public class adminVO {
	
	int Num;
	String menu;
	int price;
	int quantity;
	String gift;
	
	
	
	
	
	public adminVO(int num, String menu, int price, int quantity, String gift) {
		
		this.Num = num;
		this.menu = menu;
		this.price = price;
		this.quantity = quantity;
		this.gift = gift;
	}
	
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "adminVO [Num=" + Num + ", menu=" + menu + ", price=" + price + ", quantity=" + quantity + ", gift="
				+ gift + "]";
	}
	
	

}
