package com.kodnest.CustomException;
class MyException extends Exception{
	public MyException (){
		System.out.println("Stop Seeing marvels too much");
	}
	
	
}

public class Democustom {
	public static void main(String[] args) throws MyException {
		watchingMarvel();
		
	}

	private static void watchingMarvel() throws MyException {
		int movie=0;
		for(; movie<=10;movie++) {
			System.out.println("Watch Marvels");
			
		}
		if(movie>10) {
			throw new MyException();
		}
	}

}
