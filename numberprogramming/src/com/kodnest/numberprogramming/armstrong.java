package com.kodnest.numberprogramming;
import java.util.Scanner;
public class armstrong {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=154;
		int ori=n;
		int rem=0;
		int count=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			count ++;
			System.out.println(rem);
			n=n/10;
		}
		System.out.println("count= "+count);
		while (n>0) {
			rem =n % 10;
			sum=sum+(int)Math.pow(rem, count);
			n=n/10;
		}
		if(sum==ori) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
	}

}
