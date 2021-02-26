package com.training.ooc;

class Customer {
	static int custId = 10000;
	int customerId;
	String customerName;

	Customer(String customerName) {
		custId++;
		this.customerId = custId;
		this.customerName = customerName;
	}

	void display() {
		System.out.println("Id :" + customerId);
		System.out.println("Name :" + customerName);
	}
}

public class StaticDemo1 {
	public static void main(String[] args) {
		Customer cust1 = new Customer("A");
		//System.out.println(Customer.custId + " " + cust1.customerId);
		Customer cust2 = new Customer("B");
		//System.out.println(Customer.custId + " " + cust2.customerId);
		Customer cust3 = new Customer("C");
		System.out.println("Static var="+Customer.custId );
		System.out.println(cust1.customerId +" "+cust2.customerId+" "+cust3.customerId);
		
	}
}
