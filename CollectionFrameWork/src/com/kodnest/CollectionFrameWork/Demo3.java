package com.kodnest.CollectionFrameWork;

import java.util.ArrayList;

public class Demo3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(38);
		al.add(50);
//		System.out.println(al);
		al.remove(1);
		al.remove(2);
		al.remove(3);
		al.add(59);
		
		System.out.println(al);
		
	
//		System.out.println(al.remove(0));
//		System.out.println(al.removeAll(al));
		
		
		
	}

}
