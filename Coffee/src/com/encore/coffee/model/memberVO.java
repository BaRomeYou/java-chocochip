package com.encore.coffee.model;

public class memberVO {//수정작업 완료 
	
	
	String id;
	int no;
	String name;
	String pwd;
	String birth;
	String gender;
	String phone;
	String mail;
	int freq;
	
	
	
	public memberVO(String id, String pwd, String name,  String birth, String phone, String mail, String gender  
			) {
		
		this.name = name;
		this.pwd = pwd;
		this.birth = birth;
		this.gender = gender;
		this.phone = phone;
		this.mail = mail;
		
		this.id = id;
		
	}
	
	public memberVO() {
		
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}


	@Override
	public String toString() {
		return "memberVO [id=" + id + ", no=" + no + ", name=" + name + ", pwd=" + pwd + ", birth=" + birth
				+ ", gender=" + gender + ", phone=" + phone + ", mail=" + mail + ", freq=" + freq + "]";
	}



}
