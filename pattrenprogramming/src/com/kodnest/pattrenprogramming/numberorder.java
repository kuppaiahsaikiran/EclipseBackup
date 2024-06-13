package com.kodnest.pattrenprogramming;

public class numberorder {
	public static void main(String[]args) {
		int a=0;
		int n =6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(a+1);
				a++;
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(a+1);
				a++;
			}
			System.out.println();
		}
	}

}
