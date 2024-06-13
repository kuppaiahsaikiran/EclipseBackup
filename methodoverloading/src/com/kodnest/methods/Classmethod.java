package com.kodnest.methods;

public class Classmethod {
	public static void main(String[]args) {
		add();
		add(20);
		add(4,20);
		add(4.7f,8.2f);
		add(4.7,8.2);
		add(4,4.2);
		add(8,4.78f);
		add(4.8,8);
		add(4.8f,56);
		add(5.3f,4.19);
		
	}
	static void add() {
		System.out.println("method 1");
	}
	static void add(int a) {
		System.out.println("method 2 : "+a);
	}
	static void add(int a,int b) {
		System.out.println("method 3 : "+a+" and "+b);
	}
	static void add(float a,float b) {
		System.out.println("method 4 : "+a+" and "+b);
	}
	static void add(double a,double b) {
		System.out.println("method 5 : "+a+" and "+b);
	}
	static void add(int a,double b) {
		System.out.println("method 6 : "+a+" and "+b);
	}
	static void add(int a,float b) {
		System.out.println("method 7 : "+a+" and "+b);
	}
	static void add(double  a,int b) {
		System.out.println("method 8 : "+a+" and "+b);
	}
	static void add(float a,int b) {
		System.out.println("method 9 : "+a+" and "+b);
	}
	static void add(float a,double b) {
		System.out.println("method 10 : "+a+" and "+b);
	}

}
