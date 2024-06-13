package com.kodnest.QuestionsOnStrings;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter character");
		String inputString=scanner.nextLine();
		System.out.println("Enter a Target Index");
		int index=scanner.nextInt();
		char character=getCharacterAtIndex(inputString,index);
		System.out.println("Character at index"+index+":"+character);
	}

	 static char getCharacterAtIndex(String inputString, int index) {

			
				return inputString.charAt(index);
	}

	
}
