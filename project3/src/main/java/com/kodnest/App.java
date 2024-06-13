package com.kodnest;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Customer;
import com.kodnest.entity.Product;



public class App 
{
    public static void main( String[] args )
    {

    	
Configuration cfg=new Configuration();
	    
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Transaction tr = session.beginTransaction();
    	
    	
//    	this is for one to many
    	
    	
//    	Product p1 = new Product();
//    	p1.setPid(1);
//    	p1.setPname("Mobile");
//    	session.save(p1);
//    	
//    	Product p2 = new Product();
//    	p2.setPid(2);
//    	p2.setPname("Earphone");
//    	session.save(p2);
//    	
//    	
//    	Product p3 = new Product();
//    	p3.setPid(3);
//    	p3.setPname("Charger");
//    	session.save(p3);
//    	
//    	ArrayList plist = new ArrayList();
//    	plist.add(p1);
//    	plist.add(p2);
//    	plist.add(p3);
//    	Customer customer = new Customer(1, "Thor", plist);
//    	session.save(customer);
    	
    	
    	
//    	This is for manytomany
    	
    	
    	
    	Product p1 = new Product();
    	p1.setPid(1);
    	p1.setPname("Mobile");
    	session.save(p1);
    	
    	Product p2 = new Product();
    	p2.setPid(2);
    	p2.setPname("Earphone");
    	session.save(p2);
    	
    	
    	Product p3 = new Product();
    	p3.setPid(3);
    	p3.setPname("Charger");
    	session.save(p3);
    	

    	ArrayList<Product> plist1 = new ArrayList<Product>();
    	
    	plist1.add(p1);
    	plist1.add(p2);
    	plist1.add(p3);
    	Customer customer1 = new Customer(1, "Thor", plist1);
    	session.save(customer1);
    	
    	
    	
    	ArrayList<Product> plist2 = new ArrayList<Product>();
    	plist2.add(p1);
    	plist2.add(p2);
    	Customer customer2 = new Customer(2, "Captain", plist2);
    	session.save(customer2);
    	
    	
    	
    	


    	tr.commit();

    	
    }
}
