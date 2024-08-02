package com.tnsif.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection
{
	public static Connection getConnection() throws SQLException 
	 {
		 String url="jdbc:mysql://localhost:3306/Employee_DB";
		 String username="root";
		 String password="santhiya@123";
		 Connection con=DriverManager.getConnection(url,username,password);
		 System.out.println("connection is created");
		 return con;
	 }

}


