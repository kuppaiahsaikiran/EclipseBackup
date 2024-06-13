package com.kodnest.ExceptionHandling;


//
//import java.util.Scanner;
//
//public class ExceptionPropogation {
//	public static void main(String[] args) {
//		
////		int original_Pin=5598;
////		Scanner scan=new Scanner(System.in);
////		System.out.println("User enter the Pin");
////		int pin=0;
////		try {
////		 pin=scan.nextInt();
////		}                        //here 'e' means Exception name
////		catch(Exception e) {
////			System.out.println(e);
////		}
////		if(pin==original_Pin) {
////			System.out.println("Balance");
////		}
////		System.out.println("Thank You");
////		
//		int original_Pin=5598;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("User enter the Pin");
//		int pin=0;
//		try {
//		 pin=scan.nextInt();
//		 if(pin==original_Pin) {
//				System.out.println("Balance");
//			}
//		}                        //here 'e' means Exception name
//		catch(Exception e) {
//			System.out.println("Exception handled");
//		}
//		finally {
//			System.out.println("Thank You");
//		}
//		
//		
//	}
//
//	}
















//public class Demo{
//	public static void main(String[] args) {
//		try {
//		System.out.println(3/0);
//		}
//		
//		catch (Exception e) {
//			System.out.println("Enter only possible numbers");
//		}
//		
//		finally {
//			try {
//				System.out.println(3/0);
//				}
//				catch (Exception e) {
//					System.out.println("Enter only possible numbers");
//				}
//				
//				finally {
//					System.out.println("Close the Program");
//				}		}
//		try {
//			System.out.println(3/0);
//			}
//			catch (Exception e) {
//				System.out.println("Enter only possible numbers");
//			}
//			
//			finally {
//				System.out.println("Close the Program");
//			}
//	}
//}




















