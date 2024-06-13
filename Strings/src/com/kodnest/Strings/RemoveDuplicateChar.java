package com.kodnest.Strings;

public class RemoveDuplicateChar {
public static void main(String[] args) {
	String s="ssssaaaaiiiiikkkiirraannn";
	String s1="";
	for (int i = 0; i < s.length(); i++) {
		//Don't add to empty string
		if(s1.contains(s.charAt(i)+"")) {
			continue;
			
		}
		else {
			//add the char to string
			s1=s1+s.charAt(i);
		}
	}
	System.out.println(s1);
}
}
