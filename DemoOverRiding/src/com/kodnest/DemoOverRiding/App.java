package com.kodnest.DemoOverRiding;




class Parent{
	public void display() {
		System.out.println("a+b");
	}

}
class child extends Parent{
	public  void display() {
		System.out.println("a*b");
	}
	
}

public class App {
	public static void main(String[] args) {
		int num=10;
		System.out.println("Origina number = "+num);
		modify(num);
		System.out.println("Number after executing modify()="+num);
	}

	 static void modify(int numcopy) {
		System.out.println("Original number copy="+numcopy);
		numcopy=100;
		System.out.println("Number copy after modifications= "+numcopy);
	}

}















