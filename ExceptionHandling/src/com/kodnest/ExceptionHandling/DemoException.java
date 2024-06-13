package com.kodnest.ExceptionHandling;

import java.util.Scanner;

public class DemoException {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		//Program-1 for NumberFormatException
		System.out.println("Enter the String");
		String s=scan.next();
		int a = Integer.parseInt(s);
		System.out.println(s);



		/*// program 2 for nullPointerException
		String s=null;
		System.out.println(s.length());*/



		/*//program-3 for ClassNotFoundException
		try {
			Class.forName("Demo.class");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/


		/*//program-4 for ClassCastException
		Object o="hello";
		Integer s=(Integer)o;
		System.out.println(s);*/

		
		//program-5 for StackOverflowError
	/*	add();
	}

	private static void add() {
		System.out.println("??");
		add();*/
		
		
		
	/*	//Program for OutOfMemoryError
	  
	int a[]=new int[Integer.MAX_VALUE];*/
	}


}
