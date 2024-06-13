package com.kodnest.CollectionFrameWork;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.addFirst(44);
		ll.addLast(99);
		ll.add(2, 77);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
	
		
	}

}
