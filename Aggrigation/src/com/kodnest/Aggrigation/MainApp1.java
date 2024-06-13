package com.kodnest.Aggrigation;
class Pilot{

	String name;
	public Pilot(String name) {
		this.name=name;
	}
	void fly() {
		System.out.println(name+" is flying the plain");

	}
}
class Airlines {
	 String Airname;
	 Pilot pilot;
	 public Airlines(String Airname,Pilot pilot) {
		 this.Airname=Airname;
		 this.pilot=pilot;
	 }
	void operate() {
		System.out.println(Airname+" Operating");
		 pilot.fly();

	}
}
public class MainApp1 {
	public static void main(String[] args) {
			Pilot john=new Pilot("john");
			Airlines airlines=new Airlines("indigo", john);
			airlines.operate();
			airlines=null;
			john.fly();
			
	
		
		
	}

}
