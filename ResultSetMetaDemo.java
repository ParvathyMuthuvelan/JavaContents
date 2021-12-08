package com.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDemo {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		ResultSetMetaData rsmeta = null;
		int i;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root");
			System.out.println("connection=" + conn);
			st = conn.createStatement();
			rs = st.executeQuery("select * from employee");
			rsmeta = rs.getMetaData();
			int count = rsmeta.getColumnCount();
			for (i = 1; i <= count; i++) {
				System.out.print(rsmeta.getColumnName(i) + "\t\t");
			}
			System.out.println();
			while (rs.next()) {
				for (i = 1; i <= count; i++) {
					System.out.print(rs.getString(i) + "\t\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();

			} catch (SQLException e) {
				System.out.println(e.getErrorCode() + " " + e.getMessage());
			}
		}

	}
}
