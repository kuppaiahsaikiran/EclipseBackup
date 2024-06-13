package com.kodnest.Threading;

import java.util.Scanner;

public class MultiThread1 {
	public static void main(String[] args) {
		System.out.println("main() start");
		
//		1 start
		Thread thread=Thread.currentThread();

		thread.setPriority(9 );
		System.out.println(thread);
//		1 End
		
			printnumbers number=new printnumbers();
//			number.printnumbers();
//			number.printnumbers();
			printcharacters character=new printcharacters();
//			character.printcharacters();
//			printAddition add=new printAddition();
//			add.calculate();
			number.start();
			character.start();
			System.out.println("main() end");
		
	}

	
		
		  
	}

	


