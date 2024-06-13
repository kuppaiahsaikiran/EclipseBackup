package com.kodnest.DimentionalArrays;

public class TwoDimentionalPrincipleDiagonal {
public static void main(String[] args) {
		
		int[][]a= {{12,16,14},
				{24,14,82},
				{49,81,91}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j) {
					System.out.println(a[i][j]);
				}
			}
		}
}
}