package com.kodnest.JDBC_Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UsingScanners {

	  public static void main(String[] args) throws SQLException, ClassNotFoundException {
	        // JDBC URL, username, and password of your database
	    	System.out.println("JDBC Project");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/jdbcdb";
			String uname="root";
			String password="csaikiran@9966735886";
			Connection connection = DriverManager.getConnection(url, uname, password);

//			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,		ResultSet.CONCUR_READ_ONLY);


//	            String createTableQuery = "CREATE TABLE product (pid INT PRIMARY KEY , pname VARCHAR(30),pstatus boolean)";
//	            statement.executeUpdate(createTableQuery);
	            System.out.println("Table created successfully.");

	            
//      String insertQuery1 = "INSERT INTO product  VALUES (25,'Ghee',True)";
//	            String insertQuery2= "INSERT INTO product  VALUES (26,'Chocolate',True)";
//
//	            statement.executeUpdate(insertQuery1);
//	            statement.executeUpdate(insertQuery2);
	            String sql="insert into product values(?,?)";
	    		Scanner scan = new Scanner(System.in);
	    		System.out.println("User enter the Product-Id");
	    		int id=scan.nextInt();
	    		
	    		System.out.println("User enter the Product-Name");
	    		String name=scan.next();
	    		System.out.println("Enter the pstatus");
	    		boolean pstatus=scan.nextBoolean();
	    		PreparedStatement statement = connection.prepareStatement(sql);
	    		statement.setInt(1, id);
	    		statement.setString(2, name);
	    		statement.setBoolean(3, false);
	    		statement.executeUpdate();

	            
	            System.out.println("Value inserted successfully");
	            String sql3="delete from product where pid=?";
	    		System.out.println("User enter the Delete Product-Id");
	    		int pid=scan.nextInt();
	    		PreparedStatement statement1 = connection.prepareStatement(sql3);
	    		statement1.setInt(1, id);
	            int status = statement1.executeUpdate();

//	            String sql1="delete from product where pid=22";
//	    		boolean execute = statement.execute(sql1);
//	    		int executeUpdate = statement.executeUpdate(sql1);
	    		

//	    		System.out.println(execute);
//	    		System.out.println(executeUpdate +" Rows affected");

//	            boolean continueLoop = true;
//	            while (continueLoop) {
//	                String updateQuery = "UPDATE product SET pname = 'Milk' WHERE pid = 1";
//	                statement.executeUpdate(updateQuery);
//	                System.out.println("Value updated successfully"+updateQuery);
//
//	                
//	            }
//	            continueLoop = false;
                
                
                
                String sql2="select * from product";
     	  		 ResultSet executeQuery = statement1.executeQuery(sql2);
       		 while(executeQuery.next()) {
       			 System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
       			
       		 }
       		 executeQuery.last();
       		 while(executeQuery.isAfterLast()) {
       			 System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
       			
       		 }
       		
       		

       		System.out.println(executeQuery +" Rows affected");
       		
    		connection.close();


	    }

}
