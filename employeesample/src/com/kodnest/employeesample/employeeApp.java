package com.kodnest.employeesample;

import java.util.Scanner;

public class employeeApp {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter values for 4 objects in ssn,name,age,gender");
		employeesample e1=new employeesample(scanner.nextInt(),scanner.next(),scanner.nextInt(),scanner.next());
		employeesample e2=new employeesample(scanner.nextInt(),scanner.next(),scanner.nextInt(),scanner.next());
		employeesample e3=new employeesample(scanner.nextInt(),scanner.next(),scanner.nextInt(),scanner.next());
		employeesample e4=new employeesample(scanner.nextInt(),scanner.next(),scanner.nextInt(),scanner.next());
	e1.work();
	e1.sleep();
	e1.eat();
	System.out.println("=======================================================");
	e2.work();
	e2.sleep();
	e2.eat();
	System.out.println("========================================================");
	
	e3.work();
	e3.sleep();
	e3.eat();
	System.out.println("==========================================================");
	e4.work();
	e4.sleep();
	e4.eat();
	}
}
