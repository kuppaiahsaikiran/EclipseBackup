package com.kodnest.controlconstruct;
import java.util.Scanner;


 class ifelseif {
	 public static void main(String[]args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n=scan.nextInt();
		 if(n>0) {
			 System.out.println("positive number");
		 }
		 else if(n<0) {
			 System.out.println("negative number");
		 }
		 else {
			 System.out.println("zero");
		 }
		 }
	 
	

}
