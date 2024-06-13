package com.kodnest.ifelseif; 
import java.util.Scanner;
class uppercase {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	if(n>0 && n<=12) {
		System.out.println("child");
	}
	if(n>13 && n<=19) {
		System.out.println("Teen");
	}
	if(n>19 && n<=50) {
		System.out.println("Adult");
	
}
	}
}
