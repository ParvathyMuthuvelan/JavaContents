package com.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreparedStDemo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int regno, m1, m2, m3, total;
		String sname, choice;
		int ch;
		StudentDao dao = new StudentDao();
		List<Student> list = new ArrayList<>();
		do {
			System.out.println("CRUD Application");
			System.out.println("1.Create \n 2.Read \n 3.Update \n4.Delete");
			System.out.println("Enter choice");
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter student regno,name and marks in 3 subjects");
				regno = scanner.nextInt();
				sname = scanner.next();
				m1 = scanner.nextInt();
				m2 = scanner.nextInt();
				m3 = scanner.nextInt();
				//create(regno,name,m1,m2,m3)
				Student student = new Student();
				student.setRegno(regno);
				student.setName(sname);
				student.setWebScore(m1);
				student.setSqlScore(m2);
				student.setJavaScore(m3);
				try {
					dao.create(student);
				} catch (ClassNotFoundException e) {
					System.out.println("Driver file not loaded");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter total");
				total = scanner.nextInt();
				try {
					list = dao.read(total);
				list.forEach(s -> System.out.println(s));
//				for(Student s:list)
//				{
//					System.out.println(s);
//				}
				} catch (ClassNotFoundException e) {
					System.out.println("Driver file not loaded");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				System.out.println("Enter regno to update total");
				regno = scanner.nextInt();

				dao.update(regno);

				break;
			case 4:
				System.out.println("Enter regno to delete");
				regno = scanner.nextInt();
				try {
					dao.delete(regno);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("want to continue");
			choice = scanner.next();
		} while (choice.equals("yes"));

	}
}
