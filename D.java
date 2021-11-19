package com.pack2;

import com.pack1.A;

public class D {
	void accessA() {
		A obj = new A();
		//System.out.println("Private member=" + obj.a);
		//System.out.println("Default member=" + obj.s);
		//System.out.println("Protected member=" + obj.d);
		System.out.println("Public member=" + obj.b);
	}
}
class E extends A
{
	void accessA() {
		//A obj = new A();
//		System.out.println("Private member=" + a);
//		System.out.println("Default member=" + s);
		System.out.println("Protected member=" + d);
		System.out.println("Public member=" + b);
	}
}
class TestScope {
	public static void main(String[] args) {
		D d=new D();
        E e=new E();
        System.out.println("Non subclass outside the package can access");
        d.accessA();
        System.out.println("Subclass outside the package can access");
        e.accessA();
	}
}