import java.util.Scanner;

public class MethodDemo {

	void display() {
		System.out.println("Display method called");
	}

	void show(String s) {
		System.out.println("Value passed =" + s);
	}

	int sum(int a, int b) {
		return a + b;
	}

	String print() {
		String result = "print method called";
		return result;
	}

	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		int num1,num2;
		String s;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter a string");
		s=scanner.next();
		obj.display();
		//System.out.println(obj.display());
		obj.show("hello");
		int result=obj.sum(num1, num2);
		System.out.println("Sum="+result);
		System.out.println("Sum="+obj.sum(num1, num2));
		System.out.println("Result="+obj.print());

	}

}
