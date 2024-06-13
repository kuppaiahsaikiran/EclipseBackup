package com.kodnest.ExceptionHandling;

public class DemoforUpcallStack {
	public static void main(String[] args) {
		System.out.println("Main() start");
		method1();
		System.out.println("Main() stop");
	}

	private static void method1() {
		System.out.println("Method1() start");
      method2();		
      System.out.println("Method1() stop");
	}

	private static void method2() {
		System.out.println("Method2() start");
		method3();
		System.out.println("Method2() stop");
		
	}

	private static void method3() {
		System.out.println("Method3() start");
		System.out.println(3/0);
		System.out.println("Method3() stop");
		
	}
}
