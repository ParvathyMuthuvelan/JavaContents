
import java.util.Scanner;

class Employee {
//instance variables
	long empId ;
	String empName;
	double empSalary;
	String designation;
	
	
	/* public Employee() //default constructor 
	 {
	 System.out.println("def cons called"); }
	
	public Employee(long empId, String empName, double empSalary, String designation) {
		// super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.designation = designation;
	}*/
	//instance methods
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
	//	Employee emp2=new Employee(1003, "A",35000, "Manager");
		//emp2.putData();
		System.out.println("Etner id,name,job and salary");
		eid=scanner.nextLong();
		scanner.nextLine();
		name=scanner.nextLine();
		job=scanner.nextLine();
		sal=scanner.nextDouble();
		System.out.println("Employe 1");
		//emp.getData(1001, "Sai", 350000, "Manager");
		emp.getData(eid, name, sal, job);
		//emp.empId=1001;
	
		emp.putData();
		//emp.empId=1002;
		System.out.println("Employe 2");
	emp1.getData(1002, "Sri", 30000, "Trainee");
		emp1.putData();
		Employee emp3=emp1;
		System.out.println("Employe 3");
		emp3.putData();
		emp3.empSalary=60000;
		System.out.println("after changing salary =");
		emp1.putData();
		
		Employee emp2=null;
	emp2.putData();    //NPE
	//	System.out.println(emp.empId);
		//Employee emp2=null;
		//emp2.putData();
	
	}
}


