package com.kodnest.AlphabeticPattren;

public class PrintX {

	public static void main(String[] args) {
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=11;j++) {
				if(j==i || j==12-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	

}
