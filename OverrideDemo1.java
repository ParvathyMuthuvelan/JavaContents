package com.training.ooc;

class Superclass {
	void show() {
		System.out.println("superclass show method");
	}
	void show(String s) {
		System.out.println("superclass show method with string arg" + s);
	}
	int show(int a) {
		return a;
	}
}
class Subclass extends Superclass {
	int show(int a, int b) {
		return a + b;
	}
	void show() //overriden method
	{
		System.out.println("subclass show method");
	}
}
class Someclass {
	void show() {
		System.out.println("someclass show method");
	}
}

public class OverrideDemo1 {

	public static void main(String[] args) {
		Subclass obj=new Subclass();
		obj.show();
		System.out.println(obj.show(5));
		obj.show("hello");
		System.out.println(obj.show(5, 10));

	}

}
