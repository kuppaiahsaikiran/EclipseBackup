package com.kodnest.SumofArrays;


import java.util.Scanner;

public class ElementsOfArray {
public static void main(String[] args) {
	System.out.println("User! enter the values:");
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("User! enter the number of students:");
	int n =scanner.nextInt();
	int []marks=new int[n];
	System.out.println("User! enter the marks of the students:");
	for(int i=0;i<=marks.length-1;i++) {
		marks[i]=scanner.nextInt();
		
	}
	System.out.println("the marks of"+n+"students are");
	for(int i=0;i<=marks.length-1;i++) {
		System.out.println(marks[i]);
	}
}
}
