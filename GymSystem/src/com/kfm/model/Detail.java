package com.kfm.model;

public class Detail {
	private int p_id;
	private String p_title;
	private int p_price;
	private String p_img;
	private int p_sale;
	private String p_message;
	private int p_count;
	private String p_step; //介绍
	private String p_tip;
	public Detail() {
		super();
	}
	public Detail(int p_id) {
		super();
		this.p_id = p_id;
	}
	public Detail(int p_id, String p_title, int p_price, String p_img, int p_sale, String p_message, int p_count,
			String p_step, String p_tip) {
		super();
		this.p_id = p_id;
		this.p_title = p_title;
		this.p_price = p_price;
		this.p_img = p_img;
		this.p_sale = p_sale;
		this.p_message = p_message;
		this.p_count = p_count;
		this.p_step = p_step;
		this.p_tip = p_tip;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public String getP_img() {
		return p_img;
	}
	public void setP_img(String p_img) {
		this.p_img = p_img;
	}
	public int getP_sale() {
		return p_sale;
	}
	public void setP_sale(int p_sale) {
		this.p_sale = p_sale;
	}
	public String getP_message() {
		return p_message;
	}
	public void setP_message(String p_message) {
		this.p_message = p_message;
	}
	public int getP_count() {
		return p_count;
	}
	public void setP_count(int p_count) {
		this.p_count = p_count;
	}
	public String getP_step() {
		return p_step;
	}
	public void setP_step(String p_step) {
		this.p_step = p_step;
	}
	public String getP_tip() {
		return p_tip;
	}
	public void setP_tip(String p_tip) {
		this.p_tip = p_tip;
	}
	
	
	
}
