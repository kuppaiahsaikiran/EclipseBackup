package com.kodnest.ArrayMixedMethods;
import java.util.Scanner;
public class AllPrograms {






	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int [] array= new int[size];

		for(int i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
		}
		for(int i=0;i<array.length;i++) //displaying array
		{
			System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("even elements in array :"+" ");		
		for(int i=0;i<array.length;i++)//even elements
		{
			if(array[i]%2==0)
				System.out.print(array[i]);
		}

		System.out.println();
		System.out.print("Odd elements in array :"+" ");		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==1)
				System.out.print(array[i]);
		}

		System.out.println();
		System.out.print("All index value of an array : ");		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(i+" ");
		}

		System.out.println();
		System.out.print("Even index values of an array : ");		
		for(int i=0;i<array.length;i++)
		{
			if(i%2==0)	
				System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Odd index values of an array : ");		
		for(int i=0;i<array.length;i++)
		{
			if(i%2==1)	
				System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Even elements present in the odd index position : ");		
		for(int i=0;i<array.length;i++)
		{
			if(i%2==1 && array[i]%2==0)	
				System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("Odd elements present in the even index position : ");		
		for(int i=0;i<array.length;i++)
		{
			if(i%2==0 && array[i]%2==1)	
				System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("Elements that are multiple of 4 : ");		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%4==0)	
				System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("Elements that are not divisible by 3 : ");		
		for(int i=0;i<array.length;i++)
		{
			if(!(array[i]%3==0))	
				System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("Elements that are present in even and disible by 4 : ");		
		for(int i=0;i<array.length;i++)
		{
			if(i%2==0 && array[i]%4==0)	
				System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("Elements that are present in odd index and not disible by 3 : ");		
		for(int i=0;i<array.length;i++)
		{
			if(i%2==1 && !(array[i]%3==0))	
				System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("Elements that are both divisible by 2 and 3 and also present in even index : ");		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0 && array[i]%3==0 && i%2==0)	
				System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.print("Elements that are multiple of 5, presetn in even index not divisible by 3 : ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%5==0 && i%2==1 && !(array[i]%3==0))	
				System.out.print(array[i]+" ");
		}
	}

}

