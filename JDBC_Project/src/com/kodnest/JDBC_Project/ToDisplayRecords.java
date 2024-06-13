package com.kodnest.JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ToDisplayRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		System.out.println(connection+" success");
		Statement statement = connection.createStatement();
		String sql="select * from student";
		 ResultSet executeQuery = statement.executeQuery(sql);
		 while(executeQuery.next()) {
			 System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
//			 System.out.println(executeQuery.getInt(1));
//			 System.out.println(executeQuery.getString(2));
		 }
		 executeQuery.last();
		 while(executeQuery.isAfterLast()) {
			 System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
//			 System.out.println(executeQuery.getInt(1));
//			 System.out.println(executeQuery.getString(2));
		 }
		

		System.out.println(executeQuery +" Rows affected");
		

		connection.close();
	
	}


}
