import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
	
		int a, b, c, choice;
		Scanner scanner = new Scanner(System.in);
		String ch;
		do
		{
		System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide");
		System.out.println("Enter your choice (1,2,3,4)");
		choice = scanner.nextInt();
		System.out.println("Enter 2 numbers");
		a = scanner.nextInt();
		b = scanner.nextInt();
		switch (choice) {
		case 1:
			c = a + b;
			System.out.println("Sum=" + c);
			break;
		case 2:
			c = a - b;
			System.out.println("Difference=" + c);
			break;
		case 3:
			c = a * b;
			System.out.println("Product=" + c);
			break;
		case 4:
			c = a / b;
			System.out.println("Division=" + c);
			break;
		default:
				System.out.println("Invalid choice");

		}
		System.out.println("Want to continue yes/no");
		ch=scanner.next();
		}while(ch.equals("yes"));
		scanner.close();

	}

}
