package com.kodnest.JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ToDisplayReverseRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		System.out.println(connection+" success");
		
		
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,		ResultSet.CONCUR_READ_ONLY);

		String sql="select * from student";
		 ResultSet executeQuery = statement.executeQuery(sql);
		
		 executeQuery.last();
		do {
			System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
		}while(executeQuery.previous());
		

		System.out.println(executeQuery +" Rows affected");
		

		connection.close();
	
	}


}
