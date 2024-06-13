package com.kodnest.ConstructorChild;

public class B extends A{
	
	//0 parameter constructor
	public B() {
		
		System.out.println("3");
	}
	// one parameter constructor
		public B(int a) {
			super();
			System.out.println("2");
		}

}
