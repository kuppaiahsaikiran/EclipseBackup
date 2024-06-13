package com.kodnest.BinarySearch;

import java.util.Scanner;

public class MethodModification {
	public static void main(String[] args) {
		int result=binarysearch();
		if(result==-1) {
			System.out.println("Target not found");
		}else {
			System.out.println("Target is found at"+result);
		}
	}
	static int binarysearch() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=scan.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the Array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("User enter Target element"+"to be searched");
		int target =scan.nextInt();
		int low =0;
		int high=a.length-1;
		int mid =(low+high)/2;
		while(low<=high) {
			mid=(low+high)/2;
		if(target==a[mid]) {
		
		return mid;
	}
		else if(target>a[mid]) {
			low=mid+1;
		}else if(target<a[mid]) {
			high=mid-1;
		}

	}
	return -1;
	}
}
