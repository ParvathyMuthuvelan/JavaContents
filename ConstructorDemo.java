package com.training.ooc;
class Student
{
	private int regNumber;//instance variable
	private String studentName;
	Student() //default cons(no-arg cons)
	{
		System.out.println("Default cons called");
		//regNumber=123;
		//studentName="abc";
	}
	public Student(int regNumber) //parameterized cons
	{
		System.out.println("one-arg cons  called");
		this.regNumber = regNumber;
		
	}
//new Student(1001,"a")
	public Student(int regNumber, String studentName) //parameterized cons
	{
		System.out.println("two-arg cons called");
		this.regNumber = regNumber;
		this.studentName = studentName;
	}

	
	void display()
	{
		System.out.println("Regno:"+regNumber);
		System.out.println("Name:"+studentName);
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student s1=new Student();//def cons
		Student s=new Student();//def cons
		System.out.println("Student 1");
		s1.display();
		System.out.println("Student 2");
		s.display();
		
		Student s2=new Student(1002);//one arg cons 
		Student s3=new Student(1001,"a");//two-arg cons
	
		System.out.println("Student 2");
		s2.display();
		System.out.println("Student 3");
		s3.display();
		
		

	}

}
