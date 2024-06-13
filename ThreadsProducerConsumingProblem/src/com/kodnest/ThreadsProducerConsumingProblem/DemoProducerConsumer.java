package com.kodnest.ThreadsProducerConsumingProblem;

public class DemoProducerConsumer {
	public static void main(String[] args) {
		Factory factory=new Factory();
		Producer producer=new Producer(factory);
		Consumer consumer=new Consumer(factory);
		Thread thread1=new Thread(producer);
		Thread thread2=new Thread(consumer);
		thread1.start();
		thread2.start();
		
	}

}
class Producer implements Runnable{
	Factory f;
	

	public Producer(Factory f) {
		
		this.f = f;
	}


	@Override
	public void run() {
		int i=0;
		while (true) {
			f.produce(i++);
		}
		
	}
	
}
class Consumer implements Runnable{
	Factory f;

	public Consumer(Factory f) {
		
		this.f = f;
	}

	@Override
	public void run() {
		while(true) {
		
		f.consume();
		}
	}
	
}
class Factory {
	int num;
	boolean status=false;
	public synchronized void produce(int num)  {
		try {
		if(!status) {
		this.num=num;
		System.out.println("Produce item i = "+num);
		status =true;
		notify();
		}
		else {
			wait();
		}
	}
		catch (Exception e){
			e.printStackTrace();
			
		}
		
	}
	public synchronized void consume()  {
		try {
		if(status) {
		System.out.println("Comsumed item = "+num);
		status=false;
		notify();
		}
		
		else {
			
				wait();
			} 
		}
		catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
	

