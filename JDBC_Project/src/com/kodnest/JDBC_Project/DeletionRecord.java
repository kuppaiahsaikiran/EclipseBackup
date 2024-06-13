package com.kodnest.JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletionRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		System.out.println(connection+"success");
		Statement statement = connection.createStatement();
		String sql="delete from student where id=9";
		boolean execute = statement.execute(sql);
		int executeUpdate = statement.executeUpdate(sql);
		

		System.out.println(execute);
		System.out.println(executeUpdate +" Rows affected");

		connection.close();
	
	}

}
