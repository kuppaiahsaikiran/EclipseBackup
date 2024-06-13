package com.kodnest.Threading;

public class printcharacters extends Thread {
//		void printcharacters(){}
		public void run(){
			Thread thread=Thread.currentThread();
//			
			System.out.println(thread);
			try {
				Thread.sleep(5000,100);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}

			for(char i='a'; i<='h';i++ ) {
				System.out.println((char)i);
			}
		 

		
	}
}