package com.kodnest.JDBC_Project_2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AllQueries {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // JDBC URL, username, and password of your database
    	System.out.println("JDBC Project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="csaikiran@9966735886";
		Connection connection = DriverManager.getConnection(url, uname, password);

		Statement statement = connection.createStatement();


            // Create table
//            String createTableQuery = "CREATE TABLE product (pid INT PRIMARY KEY , pname VARCHAR(30),pstatus boolean)";
//            statement.executeUpdate(createTableQuery);
            System.out.println("Table created successfully");

            // Insert initial values

            String insertQuery1 = "INSERT INTO product  VALUES (19,'Lolipop',True)";
            String insertQuery2= "INSERT INTO product  VALUES (20,'Candy',True)";

            statement.executeUpdate(insertQuery1);
            statement.executeUpdate(insertQuery2);

            System.out.println("Value inserted successfully");

            boolean continueLoop = true;
            while (continueLoop) {
                String updateQuery = "UPDATE product SET pname = 'Dairy Milk' WHERE pid = 2";
                statement.executeUpdate(updateQuery);
                System.out.println("Value updated successfully"+updateQuery);

                
            }
            continueLoop = false;

    }
	}



