package com.kodnest.JDBC_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_3 {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/bank";
		String uname="root";
		String password="csaikiran@9966735886";
		
		
		
		String sql1="update Account set balance=balance-1000 where accid=2";
		String sql2="updat Account set balance=balance+1000 where accid=3";
		

		
	
		 connection = DriverManager.getConnection(url, uname, password);
		 connection.setAutoCommit(false);
		Statement statement = connection.createStatement();

		statement.addBatch(sql1);
		statement.addBatch(sql2);

		statement.executeBatch();
		connection.setAutoCommit(true);
		System.out.println(connection+" Success");

		}
		 catch (Exception e) {
			 System.out.println("Transaction Incomplete");
			 connection.rollback();
			}
		
	}

}
