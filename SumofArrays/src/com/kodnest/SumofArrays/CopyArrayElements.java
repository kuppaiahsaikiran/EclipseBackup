package com.kodnest.SumofArrays;

import java.util.Scanner;

public class CopyArrayElements {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s=scan.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++){
			a[i]=scan.nextInt();
			
		}
		System.out.println("Elements of the copied array:");
		for(int i=0;i<a.length;i++){
			System.out.println("Element "+(i+1)+": "+a[i]);
		}
	}
}


