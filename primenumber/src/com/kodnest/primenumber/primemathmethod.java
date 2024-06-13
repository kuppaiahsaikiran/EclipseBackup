package com.kodnest.primenumber;

import java.util.Scanner;

public class primemathmethod {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		double a=Math.sqrt(n);
		for(int i=1;i<=a;i++) {
			if(n%i==0) {
				count ++;
				System.out.println(i);
				
			}
		}if(count==1) {
			System.out.println("prime number");

	}else {
		System.out.println("Not a prime number");
	}
	}
	

}
