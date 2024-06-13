package com.kodnest.DimentionalArrays;

import java.util.Scanner;

public class SumofElements {
	
	 public static void main(String[] args) {
		 System.out.println("Enter the size");
		 Scanner scan =new Scanner(System.in);
		 int n=scan.nextInt();
	     int sum =0;
	     int[]a=new int[n];
	  
	     System.out.println("Enter the sum");
	   for(int i=0;i<a.length;i++) {
		   a[i]=scan.nextInt();
	   }
	   
		   System.out.println("Sum of elements are :");
		   for(int i=0;i<a.length;i++) {
			   sum=sum+a[i];
	   }

	 System.out.print(sum);
	}
	}

