package com.kodnest.ifelseif;
import java.util.Scanner;

 class ifelseif {
	public static void main(String[]args) {
		System.out.println("user! please enter the marks");
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		if (m>=90) {
			System.out.println('A');
		}
		 if(m>=75 && m<90) {
			System.out.println('B'); 
		 }
	}

}
