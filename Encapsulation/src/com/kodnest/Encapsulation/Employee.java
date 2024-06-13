package com.kodnest.Encapsulation;

public class Employee {

	private int id ;
	private String name;
	private String project;
	private long salary;

	public Employee(int id, String name, String project, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.salary = salary;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
