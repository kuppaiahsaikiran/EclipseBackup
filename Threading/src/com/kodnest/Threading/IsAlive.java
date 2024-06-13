package com.kodnest.Threading;



class Demo implements Runnable{

	@Override
	public void run() {

		System.out.println("Hello");
	}
	
}
public class IsAlive {
	public static void main(String[] args) {
		System.out.println("main () thread");
		
		Demo demo=new Demo();
		Thread thread=new Thread(demo);
		System.out.println(thread.isAlive());
		System.out.println("middle");
		thread.start();
		System.out.println(thread.isAlive());
		System.out.println("main () end");
	}

}
