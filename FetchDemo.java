package com.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchDemo {
	public static void main(String[] args)  {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
		//	conn=DBHandler.getConnection();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?useSSL=false", "root", "root");
			System.out.println("connection=" + conn);
			st = conn.createStatement();
			rs = st.executeQuery("select * from employees");
			System.out.println("Id \t\t Name \t\t Job\t\t Salary");
			while (rs.next()) {
				System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(7)+" "+rs.getDouble(8) );
				//System.out.println(rs.getString("employee_id") + "\t\t" + rs.getString("first_name") + "\t \t"
			//			+ rs.getString("job_id") + "\t \t" + rs.getString("salary"));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getErrorCode() +" "+e.getMessage());
			//e.printStackTrace();
		} 
			finally {
			try
			{
				rs.close();
				st.close();
				if(conn!=null)
				conn.close();
			
			
			}
			catch(SQLException e)
			{
				System.out.println(e.getErrorCode() +" "+e.getMessage());
			}
//
		}

	}
}


