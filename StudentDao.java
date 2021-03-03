package com.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	void create(Student s) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
		Connection conn = DBHandler.getConnection();
		String query = "insert into student(regno,sname,subject1,subject2,subject3) values(?,?,?,?,?)";
		ps = conn.prepareStatement(query);
		ps.setInt(1, s.getRegno());
		ps.setString(2, s.getName());
		ps.setInt(3, s.getWebScore());
		ps.setInt(4, s.getSqlScore());
		ps.setInt(5, s.getJavaScore());
		int rows = ps.executeUpdate();
		System.out.println(rows + "row  inserted");
		conn.close();
	}
	
	List<Student> read(int total) throws SQLException, ClassNotFoundException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Student> list=new ArrayList<>();
		Student s=null;
		Connection conn = DBHandler.getConnection();
		String query = "select * from student where total >?";
		ps = conn.prepareStatement(query);
		ps.setInt(1, total);
		rs = ps.executeQuery();
		System.out.println("Students with score greater than" + total);
		while (rs.next()) {
			s=new Student();
			s.setRegno(rs.getInt("regno"));
			s.setName(rs.getString("sname"));
			s.setWebScore(rs.getInt("subject1"));
			s.setSqlScore(rs.getInt("subject2"));
			s.setJavaScore(rs.getInt("subject3"));
			s.setTotalScore(rs.getInt("total"));
			list.add(s);
		}
		conn.close();
		return list;
	}
}
