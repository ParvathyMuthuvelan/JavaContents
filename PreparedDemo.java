package com.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDemo {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		int rows = 0;
		Scanner scanner=new Scanner(System.in);
		int regno,m1,m2,m3;
		String sname;
		ResultSet rs=null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training?useSSL=false", "root", "root");
			st=conn.prepareStatement("insert into student(sname,regno,subject1,subject2,subject3) values(?,?,?,?,?)");
			System.out.println("Enter student regno,name and marks in 3 subjects");
			regno = scanner.nextInt();
			sname = scanner.next();
			m1 = scanner.nextInt();
			m2 = scanner.nextInt();
			m3 = scanner.nextInt();
			st.setString(1,sname);
			st.setInt(2,regno);
			st.setInt(3,m1);
			st.setInt(4,m2);
			st.setInt(5,m3);
			rows = st.executeUpdate();
			System.out.println(rows + " row(s) inserted");
			st=conn.prepareStatement("update student set total=subject1+subject2+subject3 where regno=?");
			System.out.println("Enter regno to update total");
			regno=scanner.nextInt();
			st.setInt(1, regno);
			rows = st.executeUpdate();
			System.out.println(rows + " row(s) updated");
			st=conn.prepareStatement("select sname,total from student where total>?");
			System.out.println("Enter total to search");
			int total=scanner.nextInt();
			st.setInt(1, total);
			rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("sname") +"\t\t"+rs.getInt("total") );
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
