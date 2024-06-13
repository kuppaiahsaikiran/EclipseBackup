package com.kodnest.numberprogramming;
import java.util.Scanner;
public class sumofsquares {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("user! please enter the value of a");
	int a=scan.nextInt();
	System.out.println("user! please enter the value of b");
	int b=scan.nextInt();
	double pow=Math.pow(a, b);
	System.out.println(pow);
	}

}
