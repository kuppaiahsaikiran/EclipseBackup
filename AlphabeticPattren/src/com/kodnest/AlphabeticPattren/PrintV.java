package com.kodnest.AlphabeticPattren;

public class PrintV {
public static void main(String[] args) {
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=11;j++) {
			if(i==j&j<6 || j==12-i&i<7) {
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
