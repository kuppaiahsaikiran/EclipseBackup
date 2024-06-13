package com.kodnest.employeesample;

public class employeesample {
	
		int ssn;
		String name;
		int age;
		String gender;

	
	void work() {
		System.out.println(name+" aged "+age+" IS working");
	}
	void sleep() {
		System.out.println(name+" aged "+age+" sleeping");
	}
	void eat() {
		System.out.println(name+" aged "+age+" Eating");
	}
	public employeesample(int ssn, String name, int age, String gender) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}