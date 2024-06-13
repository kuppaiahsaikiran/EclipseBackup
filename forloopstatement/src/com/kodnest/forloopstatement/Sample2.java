package com.kodnest.forloopstatement;

import java.util.Iterator;

public class Sample2 {
public static void main(String[] args) {
	int result=1;
	for (int i = 1; i <=4; i++) {
		if(i%2==0) {
			result *=i;
		}
	}
	System.out.println(result);
}
}
