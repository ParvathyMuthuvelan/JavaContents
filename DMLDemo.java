package com.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DMLDemo {
	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		int rows = 0;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training?useSSL=false", "root", "root");
			// conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl",
			// "sysdba", "oracle");
			System.out.println(conn);
			st = conn.createStatement();
			//int result = st.executeUpdate(
				//	"create table student(regno int,sname varchar(20),subject1 int,subject2 int,subject3 int ,total int)");
			// System.out.println(result);
		/*	rows = st.executeUpdate(
					"insert into student(sname,regno,subject1,subject2,subject3) values('e',3,77,87,90)");
			System.out.println(rows + " row(s) inserted");
			rows = st.executeUpdate(
					"insert into student(sname,regno,subject1,subject2,subject3) values('f',4,88,99,90)");
			System.out.println(rows + " row(s) inserted");*/
			rows = st.executeUpdate("update student set total=subject1+subject2+subject3");
			System.out.println(rows + "row(s)  updated");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		catch(ClassNotFoundException e)
//		{
//			System.out.println("Driver file not loaded");
//			//e.printStackTrace();
//		}
		finally {
			try {
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println(e.getErrorCode() + " " + e.getMessage());
			}

		}
	}

}
