package com.kodnest.numberprogramming;

public class fibonacciseries {
	public static void main(String[]args) {
		int first=0;
		int second=1;
		int n=5;
		for(int i=0;i<=n;i++) {
			int a=first+second;
			System.out.println(" "+a);
			first=second;
			second=a;
		}
		
	}

}