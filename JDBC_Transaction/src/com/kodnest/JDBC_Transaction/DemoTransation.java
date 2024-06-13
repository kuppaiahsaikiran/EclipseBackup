package com.kodnest.JDBC_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoTransation {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost/bank";
	String uname="root";
	String password="csaikiran@9966735886";
//	String sql="create table Account(accid int,balance int)";
	Connection connection = DriverManager.getConnection(url, uname, password);
//	Statement statement = connection.createStatement();
//	statement.execute(sql);
	
	String sql="insert into Account values(?,?)";
	Scanner scan = new Scanner(System.in);
	for(int i=0;i<=5;i++) {
		
	
	System.out.println("User enter the Account Id");
	int id=scan.nextInt();
	
	System.out.println("User enter the Account Balance");
	int balance=scan.nextInt();
	PreparedStatement statement = connection.prepareStatement(sql);
	statement.setInt(1, id);
	statement.setInt(2, balance);
	statement.executeUpdate();

	}
	System.out.println("Success");
	
}
}
