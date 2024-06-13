package com.kodnest.PolyMorphism;
class Color{
	 void display(){
		 System.out.println("Color");
	 }
}
class Red extends Color{
	void display(){
		 System.out.println("Reddish");
	 }
}

public class AppMain1 {
	public static void main(String[] args) {
		/*int a=10;
		float f=a;//UpCasting
		a=(int)f; //DownCasting
		
		
		Color c=new Red();//UpCasting this is going child to parent
		((Red)c).display();// DownCasting and Narrowing this
		// + is going parent to child */
		Color c=new Color();
		c.display();
		Red r=new Red();
		r.display();
		c=r;
		c.display();
		((Red)c).display();
		
	
		
	}

}
