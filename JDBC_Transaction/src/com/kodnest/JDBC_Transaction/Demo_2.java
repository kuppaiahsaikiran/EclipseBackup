package com.kodnest.JDBC_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/bank";
		String uname="root";
		String password="csaikiran@9966735886";
//		String sql="create table Account(accid int,balance int)";
		
//		statement.execute(sql);
//		
//		String sql1="insert into Account values(1,10000)";
//		String sql2="insert into Account values(2,20000)";
//
//		String sql3="insert into Account values(3,30000)";
//
//		String sql4="insert into Account values(4,40000)";
//		String sql5="insert into Account values(5,50000)";
		
		
		
		
//		String sql1="update Account set balance=balance-1000 where accid=1";
//		String sql2="update Account set balance=balance-1000 where accid=2";
//		String sql3="update Account set balance=balance-1000 where accid=3";
//		String sql4="update Account set balance=balance-1000 where accid=4";
//		String sql5="update Account set balance=balance-1000 where accid=5";
		
		
		
//		Mix Queries
		
//		String sql1="update Account set balance=balance-1000 where accid=1";
//		String sql2="insert into Account values(6,60000)";
//		String sql3="delete from Account where Accid=1";
		
		
//		Some Methods Using

		
		String sql1="update Account set balance=balance-1000 where accid=2";
		String sql2="update Account set balance=balance+1000 where accid=3";
		

		
		Connection connection = DriverManager.getConnection(url, uname, password);
		
		
//		Some Methods Using

		connection.setAutoCommit(false);

		Statement statement = connection.createStatement();
		
		
//		this is for insertion
		
//		statement.addBatch(sql1);
//		statement.addBatch(sql2);
//
//		statement.addBatch(sql3);
//
//		statement.addBatch(sql4);
//		statement.addBatch(sql5);

		
		
//		This is for Updation
		
//		statement.addBatch(sql1);
//		statement.addBatch(sql2);
//
//		statement.addBatch(sql3);
//
//		statement.addBatch(sql4);
//		statement.addBatch(sql5);
		
		
//		This is for mix Queries
		
		
//		statement.addBatch(sql1);
//		statement.addBatch(sql2);
//
//		statement.addBatch(sql3);
		
		
//		Some Methods Using
		
		
		
		statement.addBatch(sql1);
		statement.addBatch(sql2);

		statement.executeBatch();
		
		System.out.println(connection+" Success");
		
	}
}
