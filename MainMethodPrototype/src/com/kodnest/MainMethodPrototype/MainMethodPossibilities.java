package com.kodnest.MainMethodPrototype;

public class MainMethodPossibilities {
	 public static void main(String[]args) {
		 System.out.println("1");
			
			
			
			main();
			main('A');
			System.out.println("2");
			
			main(10);
}
	
		
		 static void main(int a) {
			 System.out.println("3");
		}
		 static void main(char a) {
			 System.out.println("5");
		}
		 
		 static void main() {
			 System.out.println("7");
		}
}
