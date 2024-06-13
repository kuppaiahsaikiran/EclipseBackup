package com.kodnest.Hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Project_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		String sql="insert into student values(?,?)";

		connection = DriverManager.getConnection(url, uname, password);
		connection.setAutoCommit(false);
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter the Student Id");
		int id=scan.nextInt();
		
		System.out.println("User enter the Student name");
		String name=scan.next();
		Student student = new Student(id,name);

		int id2=student.getId();
		String name2=student.getName();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, name2);
		statement.setInt(2, id2);
		statement.executeUpdate();
		connection.setAutoCommit(true);
		System.out.println("Success");
		}
		catch (Exception e){
			connection.rollback();
			System.out.println("Exception occured");
			
		}


	}
}
