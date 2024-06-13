package com.kodnest.Demos;
import java.util.Scanner;
public class Democlass {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scanner.nextInt();
	if (n>50&&n>18) {
		System.out.println("these are eligible for blood donation");
	}else if (n<50&&n<18) {
		System.out.println("these are not eligible for blood doation");
	}

}
}

