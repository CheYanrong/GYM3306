package com.kfm.model;

public class Menuitems {
	private int id;
	private String title;
	private String icon;
	public Menuitems() {
		super();
	}
	public Menuitems(int id, String title, String icon) {
		super();
		this.id = id;
		this.title = title;
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Menuitems [id=" + id + ", title=" + title + ", icon=" + icon + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
}
