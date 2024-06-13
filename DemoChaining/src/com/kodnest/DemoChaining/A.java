package com.kodnest.DemoChaining;

public class A {
	
	 int a=10;
	 int b=89;
	public A() {
		this(10);
		System.out.println("constr-0");
	}
	public A(int a) {
		this(10,10);
		System.out.println("constr-1");
		
	}
public A(int a,int b) {
		
		System.out.println("constr-2");
		
	}


}
