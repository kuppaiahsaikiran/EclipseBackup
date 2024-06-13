package com.kodnest.JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//jdbcdb

public class CreationOfTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project");
//		Load the MYSQL JDBC Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Credential to establish the connection
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
//		Establish the connection to the database
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		System.out.println(connection+"success");
		Statement statement = connection.createStatement();
//		String sql="create table student("create table student (id int,name varchar(20))");
		boolean execute = statement.execute("create table student (id int,name varchar(20))");
		System.out.println(execute+"success");

		
	}

}
