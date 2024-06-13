package com.kodnest.primenumber;

import java.util.Scanner;

public class primenumber3 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	int reverse=0;
	int ori=n;
	while(n>0) {
		int rem=n%10;
		reverse=reverse*10+rem;
		n=n/10;
	}
	System.out.println(reverse);
			
			
		
	if(ori==reverse){
			System.out.println("palindrome");
		}else
		{
			System.out.println("Not palindrome");
		}


}
}
