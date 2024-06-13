package com.kodnest.NumberPattrens;

public class LeftAngleNumbers {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=i;j++) {
			if(i==j || j-i==-2 || j-i==-4 ) {
			System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
	System.out.println();
}
}
}
