package com.kodnest.LinearSearch;

public class ElementFound {
public static void main(String[] args) {
	int[]a= {1,2,3,4,6,7,8};
	int target=8;
	int res=linearsearch(a,target);
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
