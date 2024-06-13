package com.kodnest.CustomException;

class Bank{
	
}

class InsufficiantBalanceException extends Exception {
	public InsufficiantBalanceException() {
		System.out.println("Insufficiant Balance try to less amount next time");
		
		
	}
}
public class CustomException2 {
	public static void main(String[] args)  {
		CheckBalance();
			
		}

	private static void CheckBalance() {
		int Balance=0;
		for(; Balance<1;Balance++) {System.out.println("Insufficiant Balance try to less amount next time");
			
		}
		if(Balance>10) {

			
			
		}
		
	}
	}


