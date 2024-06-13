package com.kodnest.ThreadSyncronisatio;

public class HospitalApp {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		
		Thread thread1=new Thread(hospital);
		thread1.setName("Engineer");
		thread1.start();
		
		Thread thread2=new Thread(hospital);
		thread2.setName("Laywer");
		thread2.start();


	}

}
class Hospital  implements Runnable{


	//resources
	@Override
	public synchronized void run() {

		try {
			String name=Thread.currentThread().getName();
			System.out.println(name + " is in ICU");
			Thread.sleep(5000);
			System.out.println(name+" is getting treatement");
			Thread.sleep(5000);
			System.out.println(name+" is discharged");
		}
		catch (Exception e){
			System.out.println("Exception Handled");
		}
	}

}
