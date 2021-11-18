import java.util.Scanner;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long eid;
		String name, job;
		double sal;
		int i, n;
		// int arr[]=new int[10];
		// Employee emp[] =new Employee[5];
	//Employee emp1[]= {new Employee(1,"A",30000,"Manager"),new Employee()};
		Employee emp[];
		System.out.println("enter the number of employees");
		n = scanner.nextInt();
		emp = new Employee[n];// allocating memory for array
		// Employee emp1=new Employee();
		for (i = 0; i < n; i++) {
			System.out.println("Etner id,name,job and salary");
			eid = scanner.nextLong();
			scanner.nextLine();
			name = scanner.nextLine();
			job = scanner.nextLine();
			sal = scanner.nextDouble();
			emp[i] = new Employee();// allocating memory for individual object
			emp[i].getData(eid, name, sal, job);

		}
		System.out.println("Employee Details");
		for (i = 0; i < n; i++) {
			emp[i].putData();
		}
		System.out.println("Traversing object array with for-each loop");
		for (Employee obj : emp) {
			obj.putData();
		}
		

	}

}
