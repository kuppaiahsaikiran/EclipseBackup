package com.kodnest.constructors;
import java.util.Scanner;

 class constructors {
	public static void main(String[]args) {
		int a=10;
		int b=20;
		Scanner scan=new Scanner(System.in);
		char ch =scan.next().charAt(0);
		if(ch=='+') {
			System.out.println(a+b);
		}
		else if(ch=='-') {
			System.out.println(a-b);
		}
		else if(ch=='*') {
			System.out.println(a*b);
		}
		else if(ch=='/') {
			System.out.println(a/b);
		}
		else if(ch=='%') {
			System.out.println(a%b);
		}
		else {
			System.out.println("invalid character");
		}
		
	}

}
 
