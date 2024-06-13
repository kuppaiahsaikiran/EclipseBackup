package com.kodnest.methods;

public class EmployeeApp {
public static void main(String[] args) {
	Employee1 e1=new Employee1();
	e1.name="sai";
	e1.salary=30000;
	Employee1 e2=new Employee1();
	e2.name="saikiran";
	e2.salary=40000;
	Employee1 e3=new Employee1();
	e3.name="kiran";
	e3.salary=50000;
	System.out.println(e1.name);
	System.out.println(e1.salary);
	e1.work();
	e1.sit();
	System.out.println("===========================================");
	System.out.println(e2.name);
	System.out.println(e2.salary);
	e2.work();
	e2.sit();
	System.out.println("===========================================");
	System.out.println(e3.name);
	System.out.println(e3.salary);
	e3.work();
	e3.sit();
}
}
