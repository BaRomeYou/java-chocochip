package com.encore.coffee.model;

public class orderVO {
	
	private String id; //고객아이디 
	private	String menu_id; //메뉴아이디 
	private String menu; // 메뉴이름
	private int cnt ; //구매수량
	private int price ; //가격 
	private String date; //날짜 
	
	
	
	
	
	
	
	public orderVO(String id, String menu_id, String menu, int cnt, int price, String date) {
		
		this.id = id;
		this.menu_id = menu_id;
		this.menu = menu;
		this.cnt = cnt;
		this.price = price;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "orderVO [id=" + id + ", menu_id=" + menu_id + ", menu=" + menu + ", cnt=" + cnt + ", price=" + price
				+ ", date=" + date + "]";
	}
	
		

	
	
}
