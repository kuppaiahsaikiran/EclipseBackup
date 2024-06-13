package com.kodnest.pattrenprogramming;

import java.util.Scanner;

public class DoubleBoxesPattren {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		for(int i = 1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if((i==a) || (i+j) ==a+1)
				{
					System.out.print(" *");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			for(int j=1;j<=a;j++)
			{
				if(i==1||(i+j) ==a+1)
				{
					System.out.print(" *");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if((i-j) ==0)
				{
					System.out.print(" *");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			for(int j=1;j<=a;j++)
			{
				if( (i==a)|| (i-j) ==0)
				{
					System.out.print(" *");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}




