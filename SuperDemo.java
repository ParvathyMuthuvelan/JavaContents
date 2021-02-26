package com.training.ooc;
class Base
{
	int a;
	Base()
	{}
	Base(int a) //a=5
	{
		this.a=a;
	}
	void show()
	{
		System.out.println("Base class show method called");
	}
}

class Derived extends Base
{
	int a;
	Derived()
	{}
	//x=5,y=10
	Derived(int x,int y)
	{
		super(x); //super(5)
		this.a=y;//a=10
		
	}
	void show()
	{
		super.show();
		System.out.println("Derived class show method called");
		System.out.println("sub class  a="+a);
		System.out.println("super class  a="+super.a);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
	Derived d=new Derived(5,10);
	d.show();
	
	

	}

}
