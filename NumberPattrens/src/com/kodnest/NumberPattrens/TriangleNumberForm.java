package com.kodnest.NumberPattrens;

public class TriangleNumberForm {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=i;j++) {
			if(i-j==-2) {
				System.out.print(i);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
