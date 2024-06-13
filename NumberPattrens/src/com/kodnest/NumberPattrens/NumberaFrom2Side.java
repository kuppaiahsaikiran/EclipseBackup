package com.kodnest.NumberPattrens;

public class NumberaFrom2Side {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=i;j++) {
			if(i==6 || j-i==0 || j-i==-1 || j-i==-2 || j-i==-3 || j-i==-4 ){
				System.out.print(j);
			}
			else {
			System.out.print(" ");
			}
		}
		System.out.println();
}}
}
