package com.kodnest.pattrenprogramming;

public class DoubleHoloSquareSameLine {
public static void main(String[]args) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=8;j++) {
			if(i==1 || i==4 || i==5 || i==8 || j==1 || j==4 || j==5 || j==8)
			System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
