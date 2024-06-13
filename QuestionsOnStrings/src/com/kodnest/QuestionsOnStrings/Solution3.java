package com.kodnest.QuestionsOnStrings;

import java.util.Scanner;

public class Solution3 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter character");
	String input =scanner.nextLine();
	String result=convertCase(input);
	System.out.println("Modified string:"+result);
	
}

static String convertCase(String input) {
	String result="";
	for (int i = 0; i <input.length(); i++) {
		if(input.charAt(i)>='A'&& input.charAt(i)<='Z') {
			result +=input.substring(i,i+1).toLowerCase();
		}else if(input.charAt(i)>='a'&& input.charAt(i)<='z') {
			result +=input.substring(i,i+1).toUpperCase();
		}
		else {
			result +=input.substring(i,i+1);
		}
	}
	return result;
}
}


//Explanation for finding upper and lower case letter.

   /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = convertCase(input);

        System.out.println(result);

    }

    public static String convertCase(String input) {

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            char currentChar = charArray[i];

            if (Character.isUpperCase(currentChar)) {

                charArray[i] = Character.toLowerCase(currentChar);

            } else if (Character.isLowerCase(currentChar)) {

                charArray[i] = Character.toUpperCase(currentChar);

            }

        }

        return new String(charArray);

    }

}*/
