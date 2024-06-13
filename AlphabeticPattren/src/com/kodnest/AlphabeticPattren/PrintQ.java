package com.kodnest.AlphabeticPattren;

public class PrintQ {
public static void main(String[] args) {
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=11;j++) {
			if(i==1&j<10 || j==1&i<9 || i==9&j<10 ||j==9&i<9 || i==j&j>4) {
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
