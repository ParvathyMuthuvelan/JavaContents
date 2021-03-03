package com.training.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
	private static Connection connection = null;
	private static Properties properties = new Properties();

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		try {
			
			FileInputStream fileInputStream = new FileInputStream("db.properties");
			properties.load(fileInputStream);
			String driver=properties.getProperty("DB_DRIVER_CLASS");
			Class.forName(driver);

			connection = DriverManager.getConnection(properties.getProperty("DB_URL"),
					properties.getProperty("DB_USERNAME"), properties.getProperty("DB_PASSWORD"));
			//System.out.println(connection);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return connection;
	}
}