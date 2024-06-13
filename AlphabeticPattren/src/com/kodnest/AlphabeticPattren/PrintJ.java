package com.kodnest.AlphabeticPattren;

public class PrintJ {
public static void main(String[] args) {
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=11;j++) {
			if(i==1 || j==6 || i==11&j<7 || j==1& i>8) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
}
		System.out.println();
}
}
}
