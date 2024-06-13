package com.kodnest.Array;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("User! enter the size of an Array:");
		int n=scanner.nextInt();
		char[]a=new char [n];
	

	System.out.println("User! enter the Array elements:");
	for(int i=0;i<=a.length-1;i++) {
		a[i]=scanner.next().charAt(0);
	}
	System.out.println("The Array elements are:");
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
}
}
