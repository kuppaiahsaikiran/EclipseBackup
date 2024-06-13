package com.kodnest.SumofArrays;
// ** write a java program to display matrix of size 2x2 matrix
import java.util.Scanner;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=scanner.nextInt();
		System.out.println("Enter the columns");
		int col=scanner.nextInt();
		int [][]a=new int[row][col];
		System.out.println("Enter the matrix elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("The matrix elements are:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
}

