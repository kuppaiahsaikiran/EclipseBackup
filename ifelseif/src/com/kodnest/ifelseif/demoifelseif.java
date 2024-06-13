package com.kodnest.ifelseif;
import java.util.Scanner;
public class demoifelseif {
	public static void main(String[]args) {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if (n>50) 
	{
		System.out.println("these are eligible for blood donation");
	}else if (n<50) 
	{
		System.out.println("these are not eligible for blood doation");
	}

}
}