package com.kodnest.AlphabeticPattren;

public class PrintP {
public static void main(String[] args) {
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=11;j++) {
			if(j==1 || i==1&j<12 || j==11&i<7 || i==6&j<12) {
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
