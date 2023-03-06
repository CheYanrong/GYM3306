package com.kfm.model;

import java.util.Objects;

public class Coach {
	private int c_id;
	private String c_title;
	private String c_img;
	private int c_sale;
	private int c_price;
	private String c_message;
	private int c_distance ;
	public Coach() {
		super();
	}
	public Coach(int c_id, String c_title, String c_img, int c_sale, int c_price, String c_message, int c_count) {
		super();
		this.c_id = c_id;
		this.c_title = c_title;
		this.c_img = c_img;
		this.c_sale = c_sale;
		this.c_price = c_price;
		this.c_message= c_message;
		this.c_distance  = c_distance ;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(c_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coach other = (Coach) obj;
		return c_id == other.c_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_title() {
		return c_title;
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	public String getC_img() {
		return c_img;
	}
	public void setC_img(String c_img) {
		this.c_img = c_img;
	}
	public int getC_sale() {
		return c_sale;
	}
	public void setC_sale(int c_sale) {
		this.c_sale = c_sale;
	}
	public int getC_price() {
		return c_price;
	}
	public void setC_price(int c_price) {
		this.c_price = c_price;
	}
	public String getC_message() {
		return c_message;
	}
	public void setC_message(String c_message) {
		this.c_message = c_message;
	}
	public int getC_distance() {
		return c_distance ;
	}
	public void setC_distance(int c_distance ) {
		this.c_distance  = c_distance ;
	}
	
}
