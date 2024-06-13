package com.kodnest.Threading;

class numbers implements Runnable{
	public void run()	{
		Thread thread=Thread.currentThread();

		System.out.println(thread);


		for(int i=0; i<=9;i++ ) {
			System.out.println(i);

		}

	}

}
class characters implements Runnable {

	public void run(){
		Thread thread=Thread.currentThread();

		System.out.println(thread);


		for(char i='a'; i<='k';i++ ) {
			System.out.println((char)i);
		}
	}
}

public class MultiThreadingForRunnable {
	public static void main(String[] args) {
		System.out.println("main() start");

		Thread thread=Thread.currentThread();

		numbers number=new numbers();

		characters character=new characters ();
		Thread t1=new Thread(number);
		Thread t2=new Thread(character);

		t1.start();
		t2.start();
		System.out.println("main() end");

	}
}



