package com.kodnest.numberprogramming;

public class sumofseries {
	public static void main(String[]args) {
		int n=5;
		double sum=0.0;
		for(int i=1; i<=n;i++) {
			sum=sum+1/i;
		}
		System.out.println(sum);
	}

}
