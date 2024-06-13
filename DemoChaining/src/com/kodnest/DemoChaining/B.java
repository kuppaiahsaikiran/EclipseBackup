package com.kodnest.DemoChaining;

public class B{
	int a=10;
	String b;

	public B() {
		this(10);
		System.out.println("1");

	}
	public B(int a) {
		this("sadas");
		System.out.println("2");

	}
	public B(String b) {
		this("srfsdgd",10);
		System.out.println("3");

	}
	public B(int a,String b) {
		
		System.out.println("4");
	}
	public B(String b,int a) {
		this(10,"erfesf");
		System.out.println("5");
		
	}


}
