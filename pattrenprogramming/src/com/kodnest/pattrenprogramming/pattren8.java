package com.kodnest.pattrenprogramming;

public class pattren8 {
	public static void main(String[]args) {
		//This code for first three lines.
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		//This code for 4th Line.
		for(int i=1;i<=3;i++) {
			for(i=1;i<=3;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Last three lines printing code.
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
