package com.kodnest.pattrenprogramming;

public class Mixedtriangles {
	public static void main(String[]args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for(int n=1;n<=4;n++) {
			for(int s=1;s>=n;s--) {
				System.out.println(" ");
			}
			for(int k=1;k<=n;k++) {
			System.out.print("@");
		}
			System.out.println();
	}
		for(int i=1;i<=4;i++) {
		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("?");
		}
		System.out.println();
	}
		

}
}