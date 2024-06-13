package com.kodnest.controlconstruct;
import java.util.Scanner;

class controlconstruct {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");

		int n=scan.nextInt();
		scan.close();
		if(n>0) {
			System.out.println("positive number");
		}
		System.out.println("end");

	}
}
