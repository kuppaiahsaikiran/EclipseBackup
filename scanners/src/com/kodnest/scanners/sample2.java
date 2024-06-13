package com.kodnest.scanners;

import java.util.Scanner;

public class sample2 {

	    public static void main(String[] args) {
	    	Scanner scanner=new Scanner(System.in);
	        // Example usage:
	        double originalPrice = scanner.nextDouble();
	        double taxRate = scanner.nextDouble();
	        displayWithTax(originalPrice, taxRate);
	    }

	    public static void displayWithTax(double price, double taxRate) {
	        // Calculate the price after adding tax
	        double totalPrice = price * (1 + taxRate);

	        // Display the result
	        System.out.println("Original Price: $" + price);
	        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
	        System.out.println("Total Price (including tax): $" + totalPrice);
	    }
	}

