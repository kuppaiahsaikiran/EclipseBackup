package com.kodnest.SumofArrays;

import java.util.Iterator;
import java.util.Scanner;

public class SumOfArrayMatrics {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int [][]a=new int[2][2];
	int [][]b=new int[2][2];
	int [][]res=new int[2][2];
	// Read matrix-1.
	System.out.println("Enter the elements of matrix-1");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=scanner.nextInt();
		}
	}
	// read Matrix-2.
	System.out.println("Enter the elements of matrix-2");
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			b[i][j]=scanner.nextInt();
		}
	}
	//finding sum
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			res[i][j]=a[i][j]+b[i][j];
}
}
	//Display the sum
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.print(res[i][j]+" ");
		}

	System.out.println();
	
}
}
}
