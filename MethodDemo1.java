import java.util.Scanner;

/* Define the foll.methods
  1. Calculate the sum of first n natural numbers which are 
  divisible by 3 or 5. 
  2. To check whether a given number is prime or not
  3. To check whether a given number is armstrong number
 */

public class MethodDemo1 {

	void findSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of natural numbers=" + sum);
	}

	boolean checkPrime(int num) {
		int count = 0;
		boolean result = false;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			result = true;
		}
		return result;
	}

	boolean checkArmstrong(int num) {
		int n = num, ndigits = 0, sum = 0, rem;
		int temp = num;
		boolean result = false;
		// to find the number of digits
		while (num > 0) {
			num /= 10;
			ndigits++;
		}
		// find the sum of digits
		while (n > 0) {
			rem = n % 10;
			sum = sum + (int) Math.pow(rem, ndigits);
			n = n / 10;
		}
		if (temp == sum) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MethodDemo1 obj = new MethodDemo1();
		String ch;
		int choice;
		int num;
		do {
			System.out.println("1.Sum of natural numbers \n2.Check for prime \n3.Check for armstrong");
			System.out.println("Enter your choice (1,2,3)");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a number");
				num = scanner.nextInt();
				obj.findSum(num);
				break;
			case 2:
				System.out.println("Enter a number");
				num = scanner.nextInt();
//				boolean res=obj.checkPrime(num);
//				if(res)
				if(obj.checkPrime(num))
				{
					System.out.println(num +" is prime");
				}
				else
				{
					System.out.println(num +" is not prime");
				}
				break;
			case 3:
				System.out.println("Enter a number");
				num = scanner.nextInt();
//				boolean res=obj.checkPrime(num);
//				if(res)
			
				if(obj.checkArmstrong(num))
				{
					System.out.println(num +" is an armstromg number");
				}
				else
				{
					System.out.println(num +" is not an armstromg number");
				}
				break;
				default:
					System.out.println("Invalid choice");
			}

			System.out.println("Want to continue yes/no");
			ch = scanner.next();
		} while (ch.equals("yes"));

	}

}
