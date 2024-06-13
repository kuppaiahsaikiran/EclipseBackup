package com.kodnest.Strings;

public class CharacterArrayWithSTBuffer {
public static void main(String[] args) {
	String ch="hello";
	String str=new String(ch);
	StringBuffer stbuBuffer=new StringBuffer(str);
	System.out.println(stbuBuffer);
}
}
