package com.kodnest.numberprogramming;
import java.util.Scanner;
public class smallnumber {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();	
		int small=0;
		while(n>0) {
			int digit =n%10;
			if(digit>small) {
				small=digit;
			}
			n=n/10;
		
		System.out.println(n);
		}

}
}