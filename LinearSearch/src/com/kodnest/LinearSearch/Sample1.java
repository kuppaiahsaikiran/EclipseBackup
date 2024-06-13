package com.kodnest.LinearSearch;

public class Sample1 {
public static void main(String[] args) {
	int a[]= {1,3,2,4,7,9};
	int target=10;
	int res =linearsearch(a,target);
	if(res!=-1) {
		System.out.println("Element found");
	}else {
		System.out.println("Element Not found");
	}
}
static int linearsearch(int a[],int target) {
	for (int i = 0; i < a.length; i++) {
		if(a[i]==target) {
			return i;
		}
	}
	return -1;
}
}
