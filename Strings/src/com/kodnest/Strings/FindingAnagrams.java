package com.kodnest.Strings;

public class FindingAnagrams {
	public static void main(String[] args) {
		String s1="silent";
		String s2="lisent";
		//Strings converting to character Array.
		char[]s=s1.toCharArray();
		char[]str=s2.toCharArray();
		// character Arrays applying bubbleSort.
		String value1= bubblesort(s);
		String value2= bubbleSort(str);
		
		if(value1.equals(value2)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
		
	}
	 static String bubbleSort(char[] str) {
		int n=str.length;
		boolean swapped;
		for (int i = 0; i <n-1; i++) {
			for (int j = 0; j <n-i-1; j++) {
				if(str[j]>str[j+1]) {
					char temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		
		return new String(str);
	}
	static String bubblesort(char[] s) {
		int n=s.length;
		boolean swapped;
		for (int i = 0; i <n-1; i++) {
			for (int j = 0; j <n-i-1; j++) {
				if(s[j]>s[j+1]) {
					char temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
		return new String(s);
		
	}
}






















