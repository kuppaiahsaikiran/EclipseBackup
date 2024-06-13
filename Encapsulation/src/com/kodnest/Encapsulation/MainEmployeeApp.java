package com.kodnest.Encapsulation;

import java.util.Scanner;

public class MainEmployeeApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter values");
	
	
	int i=1;
	while(i<=5) {
		System.out.println("Enter employee"+i+"id");
		int id=scan.nextInt();
		System.out.println("Enter employee"+i+"name");
		String name=scan.next();
		System.out.println("Enter employee"+i+"project");
		String project=scan.next();
		System.out.println("Enter employee"+i+"salary");
		long salary=scan.nextLong();
		Employee e1=new Employee(id,name,project,salary);
		System.out.println(e1.getId()+"-"+e1.getName()+"-"+e1.getProject()+"-"+e1.getSalary());
		i++;
	}
}
}
