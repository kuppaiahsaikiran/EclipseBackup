package com.kodnest.DemoFinal;

class A{
	void display() {
		System.out.println("hello");
	}

}
class B extends A{
	void display() {
		System.out.println("hello");
	}

}

public class Solution {
	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}
