package com.kodnest.AlphabeticPattren;

public class PrintAWith2nd {
	public static void main(String[]args) {
		for(int i=1; i<=11; i++) {
			for(int j=1; j<=11; j++) {
				if(i+j==7 || (j==1&i>5) || (j==11&i>5) || i==6 || j-i==5) {
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

