
import java.util.Scanner;

class Employee {
//instance variables
	long empId ;
	String empName;
	double empSalary;
	String designation;

//instane methods
	void getData(long eid,String ename,double salary,String job) {
		
		empId=eid;
		empName=ename;
		empSalary=salary;
		designation=job;
	}
	void putData()
	{
	
		System.out.println("Id :"+empId);
		System.out.println("Name :"+empName);
		System.out.println("Salary :"+empSalary);
		System.out.println("Designation :"+designation);
	}
	
}

class EmployeeMain
{
	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		long eid;
		String name,job;
		double sal;
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		System.out.println("Etner id,name,job and salary");
		eid=scanner.nextLong();
		scanner.nextLine();
		name=scanner.nextLine();
		job=scanner.nextLine();
		sal=scanner.nextDouble();
		System.out.println("Employe 1");
		//emp.getData(1001, "Sai", 350000, "Manager");
		emp.getData(eid, name, sal, job);
		emp.putData();
		System.out.println("Employe 2");
		emp1.getData(1002, "Sai", 350000, "Manager");
		emp1.putData();
	//	System.out.println(emp.empId);
		//Employee emp2=null;
		//emp2.putData();
	
	}
}


