package com.kodnest.AlphabeticPattren;

public class PrintG {
	public static void main(String[]args) {
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=11;j++) {
				if(i==1 || j==1 || i==11&j<7 || j==6&i>5 || i==5&j>5 || j==11&i>4) {
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
