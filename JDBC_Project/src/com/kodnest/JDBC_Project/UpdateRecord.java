package com.kodnest.JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		System.out.println(connection+"success");
		Statement statement = connection.createStatement();
//		String sql="insert into student values(1,'john')";
		String sql="update student set name='Saikiran' where id=2";
		String sql6="update student set name='kiran' where id=3";

//		String sql2="insert into student values(2,'Rose')";
//		String sql3="insert into student values(3,'Don')";
//		String sql4="insert into student values(4,'Mufasa')";
//		String sql5="insert into student values(5,'simbha')";
		
		boolean execute = statement.execute(sql);
		int executeUpdate = statement.executeUpdate(sql6);
//		statement.execute(sql2);
//		statement.execute(sql3);
//		statement.execute(sql4);
//		statement.execute(sql5);
		System.out.println(execute+" success");

		System.out.println(executeUpdate+" Rows affected");
		connection.close();
	
	}
}
