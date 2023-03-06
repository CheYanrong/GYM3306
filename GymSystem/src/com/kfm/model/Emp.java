package com.kfm.model;

import java.io.Serializable;
import java.util.Objects;

public class Emp implements Serializable {
	private int empno;
	private String ename;
	private int esex;
	private Dept dept;
	
	public Emp() {
		super();
	}
	public Emp(String ename, int esex, Dept dept) {
		super();
		this.ename = ename;
		this.esex = esex;
		this.dept = dept;
	}
	public Emp(int empno, String ename, int esex, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.esex = esex;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", esex=" + esex + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empno == other.empno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsex() {
		return esex;
	}
	public void setEsex(int esex) {
		this.esex = esex;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
