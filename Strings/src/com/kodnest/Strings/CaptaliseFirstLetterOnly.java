package com.kodnest.Strings;

import java.util.Scanner;

public class CaptaliseFirstLetterOnly {

	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		String input =scanner.nextLine();
		StringBuilder s=new StringBuilder();
		String[]split =input.split(" ");
		for (int i = 0; i < split.length; i++) {
			String word=split[i];
			if(word.length()>0) {
				s.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1).toLowerCase()).append(" ");
			}
		}
		System.out.println(s);
	}
	/*public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String ");
		String input =scanner.nextLine();
		String result =captalizeWords(input);
		System.out.println("Formatted sentances:"+result);
		
	}

	 static String captalizeWords(String input) {
		StringBuilder s=new StringBuilder();
		String[]split =input.split(" ");
		for (int i = 0; i < split.length; i++) {
			String word=split[i];
			if(word.length()>0) {
				s.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1).toLowerCase()).append(" ");
			}
		}
		return input ;
	}*/

	

	
}


