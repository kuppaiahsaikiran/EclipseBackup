package com.kodnest.AlphabeticPattren;

public class PrintK {
public static void main(String[] args) {
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=11;j++) {
			if(j==1 || i+j==8 || i-j==4) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
}System.out.println();
}
}
}
