package com.kodnest.DemoStaticKeyWord;
class Demo{
	//	static int a=10;           
	
	//	int b=20;
	//	static void display() {
	////		int c=30;
	//System.out.println("Static method");		
	//	}
	static int a=10;
	int b=20;
//	static int c=30;
//	int d=40;
	static void display1() {
		System.out.println("Display-1");
	}
	void display2() {
		System.out.println("Display-2");
	}
	static{
		System.out.println("static - Block");
	}
	{
		System.out.println("Non-static - Block");
	}


}

public class SolutionMainApp {
	public static void main(String[] args) {
		new Demo();  //method-1
		new Demo();
		new Demo();
		new Demo();
		
		
		
		
		
		
		
		
		
		
		
//		Demo d=new Demo();         //method-2
//		System.out.println(d.a);
//		System.out.println(d.b);
//		System.out.println(d.c);
//		System.out.println(d.d);
//		Demo.display1();
//		d.display2();










		//		System.out.println(Demo.a);  //method-3
		//		Demo.display();
		//		Demo d=new Demo();
		//		System.out.println(d.b);

	}

}
