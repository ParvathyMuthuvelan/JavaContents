package com.pack1;

public class A {
	private int a;
	String s;
	protected double d;
	public int b;
	void method()
	{
		System.out.println("Private member=" + a);
	}
}

class B {
	void accessA() {
		A obj = new A();
		//System.out.println("Private member=" + obj.a);
		System.out.println("Default member=" + obj.s);
		System.out.println("Protected member=" + obj.d);
		System.out.println("Public member=" + obj.b);
	}
}

class C extends A {
	void accessA() {
		// A obj = new A();
		//System.out.println("Private member=" + a);
		System.out.println("Default member=" + s);
		System.out.println("Protected member=" + d);
		System.out.println("Public member=" + b);
	}
}

class TestScope {
	public static void main(String[] args) {
		B b=new B();
        C c=new C();
        System.out.println("Non subclass within the package can access");
        b.accessA();
        System.out.println("Subclass within the package can access");
        c.accessA();
	}
}

