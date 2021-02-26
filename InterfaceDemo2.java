package com.training.ooc;

//Man want to Fly
interface Flight {
	void fly();
}

class Human {
	void walk() {
		System.out.println("can walk");
	}
}

//class Fly
//{}
//class Man extends Human,Fly
class Man extends Human implements Flight {

	@Override
	public void fly() {
		System.out.println("Man can fly with the help the flight");

	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		Human man=new Man();
		man.walk();
		Flight flight=new Man();
		flight.fly();

	}

}
