package com.kodnest.StringConcatenation;

import java.util.Scanner;

public class Sample1 {
public static void main(String[] args) {
	System.out.println("Enter String first name");
	Scanner scanner =new Scanner(System.in);
	String s1=scanner.next();
	System.out.println("Enter String last name");
	String s2=scanner.next();
	String s3=(s1+" "+s2);
	System.out.println(s3);
	
	
}
}
