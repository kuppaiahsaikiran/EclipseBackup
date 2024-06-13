package com.kodnest.DimentionalArrays;

import java.util.Scanner;

public class TwoDimentionalJaggedArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int [][]a=new int [scanner.nextInt()][];
	int n=scanner.nextInt();
	a[0]=new int[n];
	int m=scanner.nextInt();
	a[1]=new int [m];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=scanner.nextInt();
		}
	}
	System.out.println("Student Marks :");
	for (int i = 0; i < a.length; i++) {
		
			System.out.println("College "+(i+1)+": ");
			for (int j = 0; j < a[i].length; j++) {
			System.out.println("Student "+(j+1)+": "+a[i][j]);
			
		}
	}
		
	
	

}
}
