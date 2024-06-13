package com.kodnest.CollectionFrameWork;

import java.util.ArrayList;

public class DemoCollectionFrameWork {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add("34.45");
		al.add('s');
		al.add("String");
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());

		// removie is used for remove the values by using index values
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size());
		

		
		
				
}

}
