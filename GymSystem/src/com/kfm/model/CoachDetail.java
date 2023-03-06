package com.kfm.model;

import java.util.Objects;

public class CoachDetail {
	private int c_id;
	private String c_title;
	private int c_sale;
	private int c_price;
	private String c_img;
	private int c_age;
	private String c_phone;
	private String c_message;
	private int c_distance;
	private String c_image;
	public CoachDetail() {
		super();
	}
	public CoachDetail(int c_id, String c_title, int c_sale, int c_price, String c_img, int c_age, String c_phone,
			String c_message, int c_distance, String c_image) {
		super();
		this.c_id = c_id;
		this.c_title = c_title;
		this.c_sale = c_sale;
		this.c_price = c_price;
		this.c_img = c_img;
		this.c_age = c_age;
		this.c_phone = c_phone;
		this.c_message = c_message;
		this.c_distance = c_distance;
		this.c_image = c_image;
	}
	
	
	@Override
	public String toString() {
		return "CoachDetail [c_id=" + c_id + ", c_title=" + c_title + ", c_sale=" + c_sale + ", c_price=" + c_price
				+ ", c_img=" + c_img + ", c_age=" + c_age + ", c_phone=" + c_phone + ", c_message=" + c_message
				+ ", c_distance=" + c_distance + ", c_image=" + c_image + "]";
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
		CoachDetail other = (CoachDetail) obj;
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
	public String getC_img() {
		return c_img;
	}
	public void setC_img(String c_img) {
		this.c_img = c_img;
	}
	public int getC_age() {
		return c_age;
	}
	public void setC_age(int c_age) {
		this.c_age = c_age;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
	public String getC_message() {
		return c_message;
	}
	public void setC_message(String c_message) {
		this.c_message = c_message;
	}
	public int getC_distance() {
		return c_distance;
	}
	public void setC_distance(int c_distance) {
		this.c_distance = c_distance;
	}
	public String getC_image() {
		return c_image;
	}
	public void setC_image(String c_image) {
		this.c_image = c_image;
	}
	
	
	
	
}
