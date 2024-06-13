package com.kodnest.numberprogramming;
import java.util.Scanner;
public class sumofdigit {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int sum=scan.nextInt();
		
		for(int i=1; i<=6;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
		}
	



