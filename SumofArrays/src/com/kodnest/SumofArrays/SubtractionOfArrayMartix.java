package com.kodnest.SumofArrays;

import java.util.Scanner;

public class SubtractionOfArrayMartix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = scanner.nextInt();
		System.out.println("Enter the number of columns");
		int n = scanner.nextInt();
		int [][]a=new int[m][n];
		int [][]b=new int[m][n];
		int [][]res=new int[m][n];
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
				res[i][j]=a[i][j]-b[i][j];
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
