package com.kodnest.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUseForLoop {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
//		normal Order
		System.out.println("Normal Order Using for loop : ");
		for (int i = 0; i <= al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Reverse Order using for loop : ");
//		Reverse Order
		
		for (int i = al.size()-1; i >=0 ; i--) {
			System.out.println(al.get(i));
		}
		System.out.println("Normal Order Using While loop");
		int i=0;
		while(i<=al.size()-1) {
			System.out.println(al.get(i));
			i++;
		}
		System.out.println("Normal Order Using Do While loop");
		int j=0;
		do {
			System.out.println(al.get(j));
			j++;
		}while(j<=al.size()-1);
		
	
		
	}

}
