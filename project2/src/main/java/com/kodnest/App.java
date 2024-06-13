package com.kodnest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Bike;
import com.kodnest.entity.Student;

public class App 
{
	public static void main( String[] args )
	{
		
		Configuration cfg=new Configuration();
	    
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Transaction tr = session.beginTransaction();
    	
    	
    	
    	
    	
//    	This is for creating Bike Table
    	
    	
//    	Bike bike1 = new Bike(1,"Honda");
    	
//    	Bike bike2 = new Bike(2,"Hero");
//    	
//    	Bike bike3 = new Bike(3,"Duke");
    	Bike bike4 = new Bike(4,"Honda");
    	
//    	session.save(bike1);
//    	session.save(bike2);
//    	session.save(bike3);
    	session.save(bike4);

    	
    	
    	Student student = new Student(4,"Thor",bike4);
 
    	session.save(student);
    	

    	tr.commit();

    	
	}
}
