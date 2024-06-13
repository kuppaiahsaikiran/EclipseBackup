package com.kodnest.QuestionsOnStrings;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String s=createString1();
		
		//String s1=createString2();
		//String s2=createString3();
		//String s3=createString3();
		displayEvenIndexCharacters(s);
		//displayOddIndexCharacters(s);
		//StringReverse(s3);
		//String s4=convertStringToUpperCase(s);
		//String s5=convertStringToLowerCase(s);
		

		
		displayString(s);

	}



	  static String convertStringToLowerCase(String s) {
		String str =s.toLowerCase();
		return str;
		
	}



	static String convertStringToUpperCase(String s) {
		String str=s.toUpperCase();
		return str;
	}



	private static void displayOddIndexCharacters(String s) {
		for (int i = 0; i <=s.length()-1; i++) {
			if(i%2==1) {
				System.out.println(s.charAt(i));
			}
		}		
	}



	static void displayEvenIndexCharacters(String s) {
		for (int i = 0; i <= s.length()-1; i++) {
			if(i%2==0) {
				System.out.print(s.charAt(i));
			}
		}
	}



	static void StringReverse(String s) {
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}

	}



	static void StringReverse() {

	}
	static String createString3() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=scanner.nextInt();
		char []ch= new char[size];
		System.out.println("Enter elements of array");
		for (int i = 0; i < ch.length; i++) {
			ch[i]=scanner.next().charAt(0);
		}
		String s=new String(ch);
		return s;

	}
	static String createString2() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String Value");
		String str=scanner.next();
		String s=new String(str);
		return s;
	}
	static void displayString(String s) {
		System.out.println(s);
	}
	static String createString1() {
		String s="ProGRaM";
		return s;
	}	




}

