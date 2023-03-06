package com.kfm.model;

public class Users {
	private int u_id;
	private String nickname;
	private String u_img;
	private int u_age;
	private String u_phone;
	private String u_province;
	private String u_city;
	private String u_address;
	public Users() {
		super();
	}
	public Users(int u_id, String nickname, String u_img, int u_age, String u_phone, String u_province, String u_city,
			String u_address) {
		super();
		this.u_id = u_id;
		this.nickname = nickname;
		this.u_img = u_img;
		this.u_age = u_age;
		this.u_phone = u_phone;
		this.u_province = u_province;
		this.u_city = u_city;
		this.u_address = u_address;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getU_img() {
		return u_img;
	}
	public void setU_img(String u_img) {
		this.u_img = u_img;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_province() {
		return u_province;
	}
	public void setU_province(String u_province) {
		this.u_province = u_province;
	}
	public String getU_city() {
		return u_city;
	}
	public void setU_city(String u_city) {
		this.u_city = u_city;
	}
	public String getU_address() {
		return u_address;
	}
	public void setU_address(String u_address) {
		this.u_address = u_address;
	}
	
}
