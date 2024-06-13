package com.kodnest.DimentionalArrays;


import java.util.*;



public class ThreeDimentionalArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of school:");
	int School=scanner.nextInt();
	System.out.println("enter the size of class");
	int Class=scanner.nextInt();
	System.out.println("Enter the marks of the student");
	int Marks=scanner.nextInt();
	int [][][]a=new int[School][Class][Marks];
	System.out.println("Enter the marks");
	for (int k = 0; k <School; k++) {
	for (int j = 0; j <Class ; j++) {
		for (int i = 0; i <Marks; i++) {
			a[k][j][i]=scanner.nextInt();
		}
	}
	}
	System.out.println("the student marks are:");
	for (int k = 0; k <School; k++) {
	for (int j = 0; j <Class ; j++) {
		for (int i = 0; i <Marks; i++) {
			System.out.println(a[k][j][i]);
}
}
	}
}
}
