package com.encore.coffee.model;

import java.sql.Date;

public class orderVO {
	private String id; //고객아이디 
	private String purchase_id;
	private Date date;
	private String menu; // 메뉴이름
	private int cnt ; //구매수량
	
	
	public orderVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public orderVO(String id, String purchase_id, Date date, String menu, int cnt) {
		super();
		this.id = id;
		this.purchase_id = purchase_id;
		this.date = date;
		this.menu = menu;
		this.cnt = cnt;
	}

	


	public orderVO(String id, String purchase_id, Date date) {
		super();
		this.id = id;
		this.purchase_id = purchase_id;
		this.date = date;
	}

	


	public orderVO(String purchase_id, String menu, int cnt) {
		super();
		this.purchase_id = purchase_id;
		this.menu = menu;
		this.cnt = cnt;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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




	@Override
	public String toString() {
		return "orderVO [id=" + id + ", purchase_id=" + purchase_id + ", date=" + date + ", menu=" + menu + ", cnt="
				+ cnt + "]";
	}

 
	
	
	
	
		

	
	
}
