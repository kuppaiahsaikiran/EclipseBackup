package com.kodnest.DimentionalArrays;

import java.util.Scanner;

public class TwoDimentionalArray {
public static void main(String[] args) {
	int a[][]=new int [2][2];
	Scanner scanner=new Scanner(System.in);
	for(int i=0;i<=1;i++) {
	
	for (int j = 0; j <=1; j++) {
		System.out.println("enter the marks of class"+(i+1)+"and student"+(j+1));
		a[i][j]=scanner.nextInt();
	}
	}
	for(int i=0;i<=1;i++) {
		
		for (int j = 0; j <=1; j++) {
			System.out.println(" the marks of class"+(i+1)+"and student"+(j+1));
			System.out.println(a[i][j]);
}
}
}
}
