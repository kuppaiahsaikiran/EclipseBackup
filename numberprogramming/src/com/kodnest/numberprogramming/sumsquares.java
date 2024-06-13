package com.kodnest.numberprogramming;

import java.util.Scanner;

public class sumsquares {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("user! please enter the value of n");
		int n=scan.nextInt();
		double sum=0;
		for(int i=1;i<=n; i++) {
			sum=sum+ Math.pow(i, 2);
		}
		System.out.println(sum);

}
}