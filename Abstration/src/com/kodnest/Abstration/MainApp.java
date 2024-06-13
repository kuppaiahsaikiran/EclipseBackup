package com.kodnest.Abstration;
//abstract class Addition{
//	abstract public int add(int a,int b) ;
//		
//		
//	
//}


abstract class Vehicle{
	public void start() {
		System.out.println("Vehicle has started");
	}
	public void stop() {
		System.out.println("Vehicle has stoped");
	}
	abstract void refuel();

}
class Electric_Vehicle extends Vehicle{

	@Override
	void refuel() {
		System.out.println("Charging the Vehicle");
	}

}
class PetrolCar extends Vehicle{

	@Override
	void refuel() {
		System.out.println("Filling the Petrol");
		
		
	}
	
}
class DieselCar extends Vehicle{

	@Override
	void refuel() {
		System.out.println("Filling the Diesel");
	}
	
}



public class MainApp {
	public static void main(String[] args) {
		//		Addition a = new Addition();
		//		a.add(10, 20);
//		Vehicle V=new Vehicle();
		Electric_Vehicle e=new Electric_Vehicle();
		e.start();
		e.stop();
		e.refuel();
		
		PetrolCar p=new PetrolCar();
		p.start();
		p.stop();
		p.refuel();
		
		
		DieselCar d=new DieselCar();
		d.start();
		d.stop();
		d.refuel();
		

	}

}
