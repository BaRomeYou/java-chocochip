package com.encore.coffee.model;

public class orderVO {
	
	private String id; 
	private int no;
	private int cnt; 
	private int price ;
	private String date;
	
		
	public orderVO(String id, int no, int cnt, int price, String date) {
		
		this.id = id;
		this.no = no;
		this.cnt = cnt;
		this.price = price;
		this.date = date;
	}
	
	
	
	orderVO (){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
		return "orderVO [id=" + id + ", no=" + no + ", cnt=" + cnt + ", price=" + price + ", date=" + date + "]";
	}
	
	
	
	
}
