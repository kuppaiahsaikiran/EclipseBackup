package com.kodnest.AlphabeticPattren;

public class PrintR {
	public static void main(String[] args) {
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=11;j++) {
				if(j==1 || i==1&j<10 || j==10&i<7 || i==6&j<10 || i-j==5) {
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

