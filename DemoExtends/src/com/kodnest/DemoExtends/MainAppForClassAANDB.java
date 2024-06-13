package com.kodnest.DemoExtends;

public class MainAppForClassAANDB {
	public static void main(String[] args) {
		classB b=new classB();
		System.out.println(b.b);
		b.displayB();
		
		
		classA a=new classA();
		System.out.println(a.a);
		a.displayA();
		
		
		System.out.println(b.a);
		b.displayA();
	}

}

