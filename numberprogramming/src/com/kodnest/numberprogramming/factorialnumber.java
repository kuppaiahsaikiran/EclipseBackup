package com.kodnest.numberprogramming;

public class factorialnumber {
	public static void main(String[]args) {
	int n=5;
	int factorial=1;{
	if(n==0) {
		System.out.println("1");
	}for(int i=1;i<=n;i++) {
		factorial=factorial*i;
	}
	System.out.println(factorial);
}
}
}