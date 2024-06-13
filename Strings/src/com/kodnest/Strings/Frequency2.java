package com.kodnest.Strings;
import java.util.*;
public class Frequency2 {
	



	 /*   public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("enter string");

	        String input = scanner.nextLine();

	 

	        // Count character frequencies

	        countCharacterFrequencies(input);

	    }

	 

	    // Function to count character frequencies

	    public static void countCharacterFrequencies(String str) {

	        int[] frequency = new int[256]; // Assuming ASCII characters

	 

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            frequency[ch]++;

	        }

	 

	        // Print character frequencies

	        for (int i = 0; i < 256; i++) {

	            if (frequency[i] > 0) {

	                char ch = (char) i;

	                System.out.println("Character: " + ch + " Frequency: " + frequency[i]);

	            }

	        }

	    }*/
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scanner.nextLine();
		System.out.println("Enter the value of A to Z=");
		int []a=new int[scanner.nextInt()];//A to Z total value =256.
		for (int i = 0; i < s.length(); i++) {
			int k=s.charAt(i);
			a[k]++;
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				System.out.println((char)i+"-"+a[i]);
			}
		}
	}
	

	}

