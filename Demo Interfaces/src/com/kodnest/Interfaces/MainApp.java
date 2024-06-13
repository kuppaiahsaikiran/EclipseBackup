package com.kodnest.Interfaces;

interface StudentActivities{
	void study();          //interface is also know as Abstract Method
	void eat();
	void sleep();
}
class computerScience implements StudentActivities{
                                              //implements means is - a relationship like as extends
	@Override
	public void study() {
		System.out.println("Studying");
	}

	@Override
	public void eat() {
		System.out.println("Eating");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
	}
	
}
public class MainApp {
	public static void main(String[] args) {
		computerScience cs=new computerScience();
		cs.study();
		cs.eat();
		cs.sleep();
	}

}
