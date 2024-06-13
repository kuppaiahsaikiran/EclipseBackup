package com.kodnest.Threading;

import java.util.Scanner;

public class printAddition extends Thread{
	
	
	void calculate() {
		Scanner scanner=new Scanner(System.in);
		Thread thread=Thread.currentThread();
		
		System.out.println(thread);

		System.out.println("Enter value a");
	int a=scanner.nextInt();
	System.out.println("Enter value b");

	int b=scanner.nextInt();
	System.out.println(a+b);
	}

}
