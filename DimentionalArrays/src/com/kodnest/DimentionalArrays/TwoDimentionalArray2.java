package com.kodnest.DimentionalArrays;

import java.util.Scanner;

public class TwoDimentionalArray2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("User Enter the class value:");
	int m=scanner.nextInt();
	System.out.println("User enter the marks:");
	int n=scanner.nextInt();
	int a[][]=new int[m][n];
	//read the marks-
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[1].length; j++) {
			System.out.println("Enter the marks-"+(j+1)+" of class-"+(i+1));
			a[i][j]=scanner.nextInt();
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println("The marks-"+(j+1)+" of class-"+(i+1));
			System.out.println(a[i][j]);
		}
	}
}
}
