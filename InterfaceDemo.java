package com.training.ooc;

interface IAtm {
	String SLOGAN="Best customer service"; //public,static and final
	void withdraw(double amount);//public and abstract by default

	double getBalance();
}

class HdfcBank implements IAtm {
	double balance;

	HdfcBank(double balance) {
	//	SLOGAN+="";
		this.balance = balance;
	}

	@Override
	 public void withdraw(double amount) {
		if(balance-amount<500)
		{
			System.out.println("withdraw not possible");
		}
		else
		{
			balance-=amount;
		}
	}

	@Override
	public double getBalance() {
		
		return balance;
	}
}

class IciciBank implements IAtm {
	double balance;

	IciciBank(double balance) {
		this.balance = balance;
		//SLOGAN=SLOGAN+" ";
	}

	@Override
	public void withdraw(double amount) {
		if(balance-amount<500)
		{
			System.out.println("withdraw not possible");
		}
		else
		{
			balance-=amount;
		}
		

	}

	@Override
	public double getBalance() {
	
		return balance;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		//IAtm atm=new IAtm();
		IAtm atm=new HdfcBank(10000);
		System.out.println("HdfcBank transactions ");
		System.out.println("Current balance="+atm.getBalance());
		atm.withdraw(2000);
		System.out.println("After withdraw balance="+atm.getBalance());
		System.out.println("IciciBank transactions ");
		System.out.println(atm.SLOGAN);
		 atm=new IciciBank(20000);
		System.out.println("Current balance="+atm.getBalance());
		atm.withdraw(3000);
		System.out.println("After withdraw balance="+atm.getBalance());

	}

}









