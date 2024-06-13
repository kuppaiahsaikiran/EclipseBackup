package com.kodnest.ArrayMixedMethods;
import java.util.Scanner;
public class EvenElementsOddIndex {

	public static void main(String[] args) {
		System.out.println("User! enter the size of the Array element:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int []a=new int[n];
		System.out.println("User! enter the Array elements:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=scanner.nextInt();
			
			}
		System.out.println("The Array elements are:");
		for(int i=0;i<=a.length-1;i++) {
			if((i%2==1)&&(a[i]%2==0)) {
				System.out.println(a[i]);
			}
		}
	}
	}


