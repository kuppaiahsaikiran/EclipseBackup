package com.kodnest.Strings;

public class ReplaceReverseMethod {
	public static void main(String[] args) {
		String str="this is a java program";
		
		char[]s=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<=right) {
			if(s[left]!=' '&&s[right]!=' ') {
				char temp=s[left];
				s[left]=s[right];
				s[right]=temp;
				left++;
				right--;
				
			}
			else if(s[left]==' ') {
				left++;
			}else if(s[right]==' ') {
				right--;
			}
		}
		System.out.println(new String(s));
		
	}
}
