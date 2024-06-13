package com.kodnest.switchstatement;
import java.util.Scanner;

 class switchstatement {
	public static void main(String[]args) {
		java.util.Scanner scan=new Scanner(System.in);
		System.out.println("enter a number-1");
		int a=scan.nextInt();
		System.out.println("enter the number-2");
		int b=scan.nextInt();
		System.out.println("user! enter the operator to perform the operaytion");
		char ch=scan.next().charAt(0);
		switch(ch)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		case '%':System.out.println(a%b);
		break;
		default :System.out.println("invalid character");
		}
	}

}
