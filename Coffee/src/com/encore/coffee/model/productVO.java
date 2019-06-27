package com.encore.coffee.model;

public class productVO {
	
	private String menu_id;
	private String menu;
	private int price;
	private int quantity;
	
	
	
	
	
	
	public productVO(String menu_id, String menu, int price, int quantity) {
		
		this.menu_id = menu_id;
		this.menu = menu;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
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

	@Override
	public String toString() {
		return "productVO [menu_id=" + menu_id + ", menu=" + menu + ", price=" + price + ", quantity=" + quantity + "]";
	} 

	
	
	
}
