package com.kodnest.JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateUsingScanners {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		String sql="update student set name=? where id=?";
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter the Student-Id");
		int id=scan.nextInt();

		System.out.println("User enter the Updated Student-Name");
		String name=scan.next();

		
		

		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, name);
		statement.setInt(2, id);
		
//		statement.executeUpdate();



        int status = statement.executeUpdate();
        System.out.println("Rows affected: " + status);

		

		connection.close();
	
	}

}
