import java.util.Scanner;

class Customer {
	long accountNumber;
	String customerName;
	double balance;

	void createAccount(long accNum, String cname, double bal) {
		accountNumber = accNum;
		customerName = cname;
		balance = bal;
	}

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		if (balance - amount < 500) {
			System.out.println("Insufficient Fund");
		} else {
			balance -= amount;
		}
	}

	double getBalance() {
		return balance;
	}

	void displayCustomer() {
		System.out.println("Acc. no :" + accountNumber);
		System.out.println("Name :" + customerName);
		System.out.println("Balance :" + balance);

	}

}

public class CustomerClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long accno;
		String name;
		double bal, amount;
		int choice;
		String ch;
		Customer cust = new Customer();
		Customer c1=null;
		c1.displayCustomer();
		do
		{
		System.out.println("1.Create Account \n2.Deposit\n3.Withdraw\n4.Get Balance \n5.Display ");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Etner acc.no,name,and opening balance");
			accno = scanner.nextLong();
			scanner.nextLine();
			name = scanner.nextLine();
			bal = scanner.nextDouble();
			cust.createAccount(accno, name, bal);
			break;
		case 2:
			System.out.println("Enter the amount to deposit");
			amount = scanner.nextDouble();
			cust.deposit(amount);
			break;
		case 3:
			System.out.println("Enter the amount to withdraw");
			amount = scanner.nextDouble();
			cust.withdraw(amount);
			break;
		case 4:
			System.out.println("Current Balance :" + cust.getBalance());
			break;
		case 5:
			System.out.println("Customer Details ");
			cust.displayCustomer();
			break;
		default:
			System.out.println("Invalid choice");
		}
		System.out.println("want to continue yes/no");
		ch=scanner.next();
		}while(ch.equals("yes"));

	}

}
