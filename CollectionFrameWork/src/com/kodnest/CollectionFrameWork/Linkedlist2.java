package com.kodnest.CollectionFrameWork;

import java.util.LinkedList;

public class Linkedlist2 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
	
		System.out.println(	ll.peek());
		
		System.out.println(ll.peekFirst());
	
		System.out.println(	ll.peekLast());
	
		ll.poll();
		System.out.println(ll	);
		ll.pollFirst();
		System.out.println(ll);
		ll.pollLast();
		System.out.println(ll);
		
	}

}
