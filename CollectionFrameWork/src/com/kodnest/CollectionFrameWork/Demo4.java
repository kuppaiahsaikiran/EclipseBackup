package com.kodnest.CollectionFrameWork;

import java.util.ArrayList;

public class Demo4 {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		//		System.out.println(al1);
		ArrayList al2=new ArrayList();
		al2.add(40);
		al2.add(50);
		al2.add(60);
		//		System.out.println(al2);
		ArrayList al3=new ArrayList();
		al3.add(70);
		al3.add(80);
		al3.add(1,al1);

		al3.add(al2);
		System.out.println(al3);

		al3.clone();
		System.out.println(al3);

	}

}
