package com.kodnest.BinarySearch;

public class BinarySearch1 {
public static void main(String[] args) {
	binarysearch();
}
static void binarysearch() {
	System.out.println("Binary Search");
	int[]a= {1,2,3,5,6,7,8,20};
	int target =9;
	int low =0;
	int high=a.length-1;
	int mid =(low+high)/2;
	while(low<=high) {
		mid=(low+high)/2;
	if(target==a[mid]) {
	System.out.println("Element is found"+mid);
	return;
}
	else if(target>a[mid]) {
		low=mid+1;
	}else if(target<a[mid]) {
		high=mid-1;
	}

}
System.out.println("Element isn't found");
}
}

