package com.kodnest.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class DemoException2 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
//		try {
//			Class.forName("Demo");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter value of size");
		int size=0;
		int []a=null;
		int index=0;
		
		try {
			size=scan.nextInt();
			a=new int[size];
			System.out.println("Enter an index Value");
			 index=scan.nextInt();
				System.out.println(a[index]);

			
		}
		catch (InputMismatchException e){
			System.out.println("User! enter integer value");
			
		}
		catch (NegativeArraySizeException e){
			System.out.println("Please enter non-zero Positive array");
			
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("User enter greater than -1 and less than "+size);
			
		}
		catch (Exception e){
			System.out.println(e);
			
		}
	
		
	
		
	}

}
