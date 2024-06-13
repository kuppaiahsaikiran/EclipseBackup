package com.kodnest.ArrayMixedMethods;
import java.util.*;
public class ElementsNotDiv3 {

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
			if(a[i]%3!=0) {
				System.out.println(i);
			}
		}
	}
	}                               //10/3=1
                                    //o/p:0
// 0  1  2  3  4  5  6  7  8  9
// 10 20 33 44 52 66 75 80 95 100

