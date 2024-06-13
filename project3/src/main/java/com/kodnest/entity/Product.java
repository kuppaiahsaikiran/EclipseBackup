package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	
	@Id
	int pid;
	String pname;
	
	
	
//	this is for manytoone
	
//	@ManyToOne
//	Customer customer;
	
	
	@ManyToMany
	Customer customer;
	
	
	public Product() {
		super();
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", customer=" + customer + "]";
	}
	public Product(int pid, String pname, Customer customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
