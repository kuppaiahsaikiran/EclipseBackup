package com.kodnest.Threading;

public class printnumbers extends Thread{
	
	
 //		void printnumbers(){}
	public void run()	{
			Thread thread=Thread.currentThread();
//			
			System.out.println(thread);
		try {
			Thread.sleep(5000,100);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}

			for(int i=0; i<=9;i++ ) {
				System.out.println(i);
			
		}

	
		
		
	}
	
	
	
}
