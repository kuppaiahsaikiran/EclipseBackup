package com.kodnest.numberprogramming;
import java.util.Scanner;
public class sumofdigit2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Calculate the sum of digits
	        int sum = calculateSumOfDigits(number);

	        // Display the result
	        System.out.println("Sum of digits: " + sum);

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to calculate the sum of digits
	    private static int calculateSumOfDigits(int num) {
	        int sum = 0;

	        // Iterate through each digit and add it to the sum
	        while (num != 0) {
	            int digit = num % 10;
	            sum += digit;
	            num /= 10;
	        }

	        return sum;
	    }
	}



