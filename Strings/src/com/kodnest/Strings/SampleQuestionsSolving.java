package com.kodnest.Strings;
import java.util.*;
public class SampleQuestionsSolving {
	    public static String findLongestUniqueSubstring(String input) {
	        if (input == null || input.isEmpty()) {
	            return "";
	        }

	        int n = input.length();
	        int start = 0;
	        int maxLength = 0;
	        int currentLength = 0;
	        HashMap<Character, Integer> charIndexMap = new HashMap<>();

	        for (int end = 0; end < n; end++) {
	            char currentChar = input.charAt(end);

	            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
	                start = charIndexMap.get(currentChar) + 1;
	            }

	            charIndexMap.put(currentChar, end);
	            currentLength = end - start + 1;

	            if (currentLength > maxLength) {
	                maxLength = currentLength;
	            }
	        }

	        return input.substring(start, start + maxLength);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        String input = scanner.nextLine();

	        scanner.close();

	        String longestUniqueSubstring = findLongestUniqueSubstring(input);

	    ;
	        System.out.println("Output: " + longestUniqueSubstring);
	    }
	

	

	
	/*    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        System.out.print("Enter the sorted array elements: ");
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the target element: ");
	        int target = scanner.nextInt();
	        int[] occurrences = findOccurrences(arr, target);
	        System.out.print("Indices of all occurrences of " + target + ": ");
	        for (int index : occurrences) {
	            System.out.print(index + " ");
	        }
	    }
	    private static int[] findOccurrences(int[] arr, int target) {
	        int firstIndex = findFirstIndex(arr, target);

	        if (firstIndex == -1) {
	            return new int[]{};
	        }

	        int lastIndex = findLastIndex(arr, target);

	        int[] occurrences = new int[lastIndex - firstIndex + 1];
	        for (int i = 0; i < occurrences.length; i++) {
	            occurrences[i] = firstIndex++;
	        }

	        return occurrences;
	    }
	    private static int findFirstIndex(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;
	        int result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                high = mid - 1; 
	            } else if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return result;
	    }
	    private static int findLastIndex(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;
	        int result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                low = mid + 1; 
	            } else if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return result;
	    }*/
	}

