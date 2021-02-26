package com.training.ooc;
class A
{
	A()
	{
		System.out.println("super class constructor called");
	}
}
class B extends A
{
	B()
	{
		// super();
		
		System.out.println("sub class B's constructor called");
	}
}
class C extends B
{
	C()
	{
		//super();
		
		System.out.println("sub class C's constructor called");
	}
}
public class ConsInheritance {

	public static void main(String[] args) {
		//B b=new B();
		C c=new C();
	}
}
