package com.kodnest.Strings;

public class ReverseSentance {
public static void main(String[] args) {
	String str="this is a java program";
	String[]split=str.split(" ");
	for (int i = split.length-1; i >=0; i--) {
		System.out.print(split[i]+" ");
	}
}
}
