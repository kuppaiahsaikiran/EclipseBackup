package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	int sid;
	String sname;

	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", bike=" + bike + "]";
	}

	public Student(int sid, String sname, Bike bike) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.bike = bike;
	}

	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}


	@OneToOne
	Bike bike;
	
	
	
	
}
