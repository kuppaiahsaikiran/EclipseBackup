package com.kodnest.Strings;

public class ReverseOrder {
public static void main(String[] args) {
	String s="java is fun";
	for (int i = s.length()-1; i >=0; i--) {
		System.out.print(s.charAt(i));
	}
}
}
