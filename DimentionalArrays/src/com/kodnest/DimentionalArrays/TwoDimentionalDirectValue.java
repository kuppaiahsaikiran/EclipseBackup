package com.kodnest.DimentionalArrays;

public class TwoDimentionalDirectValue {
	public static void main(String[] args) {
		
		int[][]a= {{12,16,14},
				{24,14,82},
				{49,81,91}};
		int m=a.length-1;
		int n=a[0].length-1;
		int i =0;
		for (int j = 0; j <= m; j++) {


			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	
		int j=m;
		for ( i = 1; i <=m; i++) {
			System.out.println(a[i][j]+" ");
		}
		
	}
		
	
}

