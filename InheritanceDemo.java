package com.training.ooc;

class Employee {
	int employeeId;
	String employeeName;
	String department;

	Employee() {
		System.out.println("employee def cons called");
	}

	public Employee(int employeeId, String employeeName, String department) {
		System.out.println("employee arg cons called");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}

	void display() {
		System.out.println("Id :" + employeeId);
		System.out.println("Name :" + employeeName);
		System.out.println("Department :" + department);
	}

}

class PermanentEmployee extends Employee {
	double salary;

	PermanentEmployee() {
		//super();
		System.out.println("perm employee def cons called");
	}

	public PermanentEmployee(int employeeId, String employeeName, String department, double salary) {
       //System.out.println();
		super(employeeId, employeeName, department);// super class arg cons
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.department = department;
		this.salary = salary;
		System.out.println("perm employee arg cons called");
	}

	void print() {
		display();
		System.out.println("Salary :" + salary);
	}

}

class Trainee extends Employee {
	double stipend;

	Trainee() {
		System.out.println("trainee class def cons called");
	}

	public Trainee(int employeeId, String employeeName, String department, double stipend) {
		super(employeeId, employeeName, department);
		this.stipend = stipend;
		System.out.println("trainee class arg cons called");
	}
	void output()
	{
		display();
		System.out.println("Stipend :" + stipend);
	}

}

public class InheritanceDemo {

	public static void main(String[] args) {
		PermanentEmployee emp = new PermanentEmployee();
		emp.print();
		PermanentEmployee emp1 = new PermanentEmployee(1001, "A", "IT", 35000);
		emp1.print();
		Trainee trainee=new Trainee();
		trainee.output();
		Trainee trainee1=new Trainee(1002,"B","IT",15000);
		trainee1.output();

	}

}
