package com.kodnest.Array;
import java.util.Scanner;
public class OddIndexArray {
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("User! enter the size of an Array");
			int n=scanner.nextInt();
			int [] a = new int [n];
			System.out.println("User! enter the Array elements ");
			for(int i=0;i<=a.length-1;i++) {
				a[i]=scanner.nextInt();
			}
			System.out.println("The Array elements are:");
			for(int i=0;i<=a.length-1;i++) {
				if(i%2==1) {
				System.out.println(a[i]);
			}
		}
		}
	}




