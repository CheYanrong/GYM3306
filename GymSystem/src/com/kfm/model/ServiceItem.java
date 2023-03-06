package com.kfm.model;

public class ServiceItem {
	private int id;
	private String subject;
	private String coverpath;
	private String message;
	public ServiceItem(int id, String subject, String coverpath, String message) {
		super();
		this.id = id;
		this.subject = subject;
		this.coverpath = coverpath;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCoverpath() {
		return coverpath;
	}
	public void setCoverpath(String coverpath) {
		this.coverpath = coverpath;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
