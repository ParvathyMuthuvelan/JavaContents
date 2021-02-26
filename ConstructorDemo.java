package com.training.ooc;
class Student
{
	private int regNumber;
	private String studentName;
	Student() //default cons(no-arg cons)
	{
		System.out.println("Default cons called");
		regNumber=123;
		studentName="abc";
	}
	
	public Student(int regNumber, String studentName) //parameterized cons
	{
		System.out.println("param cons called");
		this.regNumber = regNumber;
		this.studentName = studentName;
	}

	public int getRegNumber() {
		return regNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student(1001,"a");
		System.out.println("Student 1");
		System.out.println("Reg no :"+s1.getRegNumber());
		System.out.println("Name :"+s1.getStudentName());
		System.out.println("Student 2");
		System.out.println("Reg no :"+s2.getRegNumber());
		System.out.println("Name :"+s2.getStudentName());
		System.out.println("Student 3");
		System.out.println("Reg no :"+s3.getRegNumber());
		System.out.println("Name :"+s3.getStudentName());

	}

}
