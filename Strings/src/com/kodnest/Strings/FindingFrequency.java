package com.kodnest.Strings;
import java.util.Scanner;
public class FindingFrequency {
/*public static void main(String[] args) {
	String s="helhloh";
	char ch='e';
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)==ch) {
			count++;
		}
	}
	System.out.println("the Total="+count);
}*/
	
	
	

	

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

	    }*/


	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the input string
	        System.out.println("Enter the input string:");
	        String inputString = scanner.nextLine();

	        // Read the target character
	        System.out.println("Enter the target character:");
	        char targetChar = scanner.nextLine().charAt(0);

	        // Count the occurrences of the target character
	        int occurrenceCount = countOccurrences(inputString, targetChar);

	        // Print the result
	        System.out.println("Number of occurrences: " + occurrenceCount);

	        scanner.close();
	    }

	    private static int countOccurrences(String inputString, char targetChar) {
	        int count = 0;

	        // Loop through each character in the string
	        for (int i = 0; i < inputString.length(); i++) {
	            // Check if the current character is equal to the target character
	            if (inputString.charAt(i) == targetChar) {
	                count++;
	            }
	        }

	        return count;
	    }
}



	

