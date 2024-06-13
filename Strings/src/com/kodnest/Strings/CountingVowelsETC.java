package com.kodnest.Strings;

import java.util.Scanner;

public class CountingVowelsETC {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string value");
		String s=scanner.nextLine();
		int vowels=0;
		int  letters=0;
		int digits=0;
				for (int i = 0; i < s.length(); i++) {
					
					//print Vowels
					
					if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
						vowels++;
					}
					
					//print consonants
					
					if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
						letters++;
					}
					
					//print digits
					if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
						digits++;
						
					}
				}
				
				int consonants=letters-vowels;
				
				//print Special Characters
				int Special_Characters=s.length()-(vowels+consonants+digits);
				System.out.println("vowels: "+vowels);
				System.out.println("consonents: "+consonants);
				System.out.println("digits: "+digits);
				System.out.println("Special characters: "+Special_Characters);
				
				}
			
}
