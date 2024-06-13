package com.kodnest.CollectionFrameWork;

import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
	
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
//		//using the index concept we can add by using index values
//		al.add(0,60);
//		
//		al.add(4,60);
		System.out.println(al1);
		ArrayList al2=new ArrayList();
		al2.add(40);
		al2.add(50);
		al2.add(60);
		System.out.println(al2);
		ArrayList al3=new ArrayList();
		al3.addAll(al1);
		al3.add(al2);
		al3.addAll(2,al2);
		
		
	
		System.out.println(al3);
		
//		System.out.println(al.size());

//		al.remove(3);
//		System.out.println(al);
//		System.out.println(al.size());
		

		
		
				
}


}
