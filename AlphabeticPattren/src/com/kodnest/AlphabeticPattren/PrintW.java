package com.kodnest.AlphabeticPattren;

public class PrintW {
public static void main(String[] args) {
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=11;j++) {
			if(j==11 ||j==1 || i==j&j>5 || j==12-i& i>6) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
}
		System.out.println();
}
}
}

