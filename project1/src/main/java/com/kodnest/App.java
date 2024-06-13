package com.kodnest;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration();
    
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Transaction tr = session.beginTransaction();
    	
//    	Employee employee1 = new Employee(3,"Thor");
//    	Employee employee2 = new Employee(3,"Captan");
    	
//    	Employee employee3 = new Employee(3,"Captan");

//    	Employee employee4 = session.get(Employee.class,2);
//    	System.out.println(employee4);
    	
    	
//    	List list = session.createQuery("from Employee where id=2").list();
//    	List list = session.createQuery("from Employee where id<2").list();
    	List list = session.createQuery("from Employee where id<=3").list();


    	for (Object object : list) {
			System.out.println(object);
		}

    	
//    	session.save(employee1);
//    	session.update(employee2);
//    	session.delete(employee3);


    	
    	tr.commit();
    	
//   not needed 	System.out.println(session+" Success");
    	
    }
}
