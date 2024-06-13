package com.kodnest.numberprogramming;
import java.util.Scanner;
 class squaresandcubes {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double sqrt=Math.sqrt(n);
		System.out.println((int)sqrt);
		double cbrt=Math.cbrt(n);
		System.out.println((int)cbrt);
	}

}
