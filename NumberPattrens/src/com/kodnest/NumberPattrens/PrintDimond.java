package com.kodnest.NumberPattrens;

public class PrintDimond {
public static void main(String[] args) {
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=11;j++) {
			if(i+j==7 || i-j==5 || j-i==5|| j+i==-7 || i+j==17) {
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
