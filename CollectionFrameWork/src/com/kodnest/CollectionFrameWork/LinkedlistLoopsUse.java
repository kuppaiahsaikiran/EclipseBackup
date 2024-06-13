package com.kodnest.CollectionFrameWork;

import java.util.LinkedList;

public class LinkedlistLoopsUse {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		System.out.println("for Peak()");
		for (int i = 0; i <1 ; i++) {
			System.out.println(ll.peek());
		}
		System.out.println("for PeakFirst()");

		for (int i = 0; i <1 ; i++) {
			System.out.println(ll.peekFirst());
		}
		System.out.println("for PeakLast()");

		for (int i = 0; i <1 ; i++) {
			System.out.println(ll.peekLast());
		}
		System.out.println("for Poll()");

		for (int i = 0; i <1 ; i++) {
			System.out.println(ll.poll());
		}
		System.out.println("for PollFirst()");
		for (int i = 0; i <1 ; i++) {
			System.out.println(ll.pollFirst());
		}
		System.out.println("for PollLast()");
		for (int i = 0; i <1 ; i++) {
			System.out.println(ll.pollLast());
		}
	}

}
