package com.kfm.model;

public class ProjectType {
	private int pt_id;
	private String pt_name;
	private String pt_icon;
	public ProjectType() {
		super();
	}
	public ProjectType(int pt_id, String pt_name, String pt_icon) {
		super();
		this.pt_id = pt_id;
		this.pt_name = pt_name;
		this.pt_icon = pt_icon;
	}
	public ProjectType(int pt_id) {
		super();
		this.pt_id = pt_id;
	}
	public int getPt_id() {
		return pt_id;
	}
	public void setPt_id(int pt_id) {
		this.pt_id = pt_id;
	}
	public String getPt_name() {
		return pt_name;
	}
	public void setPt_name(String pt_name) {
		this.pt_name = pt_name;
	}
	public String getPt_icon() {
		return pt_icon;
	}
	public void setPt_icon(String pt_icon) {
		this.pt_icon = pt_icon;
	}
	
	
}
