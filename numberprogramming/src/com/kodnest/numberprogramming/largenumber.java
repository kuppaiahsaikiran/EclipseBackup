package com.kodnest.numberprogramming;
import java.util.Scanner;
public class largenumber {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();		
		int lar=0;
		while(n>0) {
			int digit =n%10;
			if(digit>lar) {
				lar=digit;
			}
			n=n/10;
		
		System.out.println(n);
	}

}
}