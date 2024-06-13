package com.kodnest.SumofArrays;

import java.util.Iterator;
import java.util.Scanner;

public class BorderArrayElement {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int m=scanner.nextInt();
	int n=scanner.nextInt();
	int a[][]=new int[m][n];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=scanner.nextInt();
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println(a[i][j]);
		}
}
}
}
