package com.kodnest.PolyMorphism;
class Shape{
	void draw() {
		System.out.println("Drawing a Shape");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a Circle");
	}
	
}
/*same method name  but different forms or parameters
 *  is called method Overriding
     *AND same method name and different parameters is 
     *called method Overloading. 
       */
      /*when happening method Overriding compulsory
        having Extends or is-a relationship*/

public class App {
	public static void main(String[] args) {
		
		//Object creation is happening in run time only
		Shape s=new Shape();
		s.draw();
		Rectangle r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();
	}

}
