package com.jdbc.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private MyConnection() {
		
	}
	private static Connection connection;
	public static Connection getMyConnection() {
		try {
			if(connection==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/empsystem","root","Sydney1999@");
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return connection;
	}
}