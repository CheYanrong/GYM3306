package com.kfm.model;

import java.io.Serializable;
import java.util.Objects;

public class Dept implements Serializable {
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept() {
		super();
	}
	
	public Dept(int deptno) {
		super();
		this.deptno = deptno;
	}

	public Dept(String dname, String loc) {
		super();
		this.dname = dname;
		this.loc = loc;
	}
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "{ \"deptno\":" + deptno+"}";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		return deptno == other.deptno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
