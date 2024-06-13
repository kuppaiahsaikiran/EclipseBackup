package com.kodnest.AlphabeticPattren;

public class AllAlphabetics {
	public static void main(String[] args) {
		for(int i=1; i<=11; i++) {
			for(int j=1; j<=11; j++) {
				if(i==1 || i==6 || j==1 || j==11) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		
		}
		System.out.println("                                    ");
		for(int i=1; i<=11; i++) {
			for(int j=1; j<=11; j++) {
				if(i==1 || j==1 || i==11 || i==6 || j==11) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		System.out.println("            ");
	
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=6;j++) {
			if(i==1 || j==1 || i==6) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}


for(int i=1;i<=7;i++) {
	for(int j=1;j<=7;j++) {
		if(i==1 || i==7 || j==1 || j==7) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}
	{
	System.out.println("      ");
}
}


	


