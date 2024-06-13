package com.kodnest.SumofArrays;

import java.util.Scanner;

public class SumOfArrayElements {
	
	    public static void main(String[] args) {
	        // Your code here
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        int [] a=new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=scan.nextInt();
	        }
	        int sum=0;
	        for(int num : a){
	            sum +=num;
	        }
	        System.out.println("Sum of Array Elements: "+sum);
	        scan.close();
	    }
	}

