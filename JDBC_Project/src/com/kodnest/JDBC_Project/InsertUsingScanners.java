package com.kodnest.JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingScanners {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		String sql="insert into student values(?,?)";
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter the Student-Id");
		int id=scan.nextInt();
		
		System.out.println("User enter the Student-Name");
		String name=scan.next();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.executeUpdate();



		
		
//		String sql2="insert into student values(2,'Rose')";
//		String sql3="insert into student values(3,'Don')";
//		String sql4="insert into student values(4,'Mufasa')";
//		String sql5="insert into student values(5,'simbha')";
//		String sql6="insert into student values(6,'saikiran')";
		
//		statement.execute(sql2);
//		statement.execute(sql3);
//		statement.execute(sql4);
//		statement.execute(sql5);
//		statement.execute(sql6);

		System.out.println(connection+"success");
		connection.close();
	
	}
}
