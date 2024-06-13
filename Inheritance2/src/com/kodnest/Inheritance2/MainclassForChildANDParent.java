package com.kodnest.Inheritance2;

public class MainclassForChildANDParent {
	public static void main(String[] args) {
		Parent p=new Parent();
		
		System.out.println(p.getPmoney());
		Child ch=new Child();
		
		System.out.println(ch.Cmoney);
		
		//child class object accessing parent class
		System.out.println(ch.getPmoney());
		
		//parent class object cannot access child class
		//System.out.println(p.Cmoney);

	}
}
