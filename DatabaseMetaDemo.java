package com.training.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

//DatabaseMetaData,ResultSetMetaData
public class DatabaseMetaDemo {

	public static void main(String[] args) {
		Connection conn = null;
		DatabaseMetaData dbmeta = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root");
			dbmeta = conn.getMetaData();
			System.out.println(dbmeta.getDatabaseProductName());
			System.out.println(dbmeta.getDatabaseMajorVersion());
			System.out.println(dbmeta.getDriverName());
			System.out.println(dbmeta.getDriverMajorVersion());
			System.out.println(dbmeta.getNumericFunctions());
			System.out.println(dbmeta.getURL());
		} catch (SQLException e) {
System.out.println(e.getMessage());
		}

	}

}
