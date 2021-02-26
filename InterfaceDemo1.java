package com.training.ooc;

interface interface1 {
	void show();
}

interface interface2 {
	void show();
	void display();
}

class Testt implements interface1, interface2 {

	@Override
	public void show() {
		System.out.println("show method called");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		interface1 ref1 = new Testt();
		ref1.show();
		interface2 ref2 = new Testt();
		ref2.show();
	}
}
