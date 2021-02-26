package com.training.ooc;

public class StaticDemo {
	int a;
	static int b;
	void methodA() //non-static method/instance method
	{
		int localVar;
		System.out.println("From instance method accessing ");
		System.out.println("instance variable ="+a);
		System.out.println("static variable ="+b);
		//System.out.println("local variable ="+localVar);
	}
    static void methodB()
    {
    	StaticDemo s=new StaticDemo();
    	System.out.println("From static method accessing ");
    	System.out.println("instance variable ="+s.a);
    	//System.out.println("instance variable ="+a);
		System.out.println("static variable ="+b);
    }
    static
    {
    	System.out.println("static block initialized b="+b);
    	b=b+5;
    	System.out.println("static var in static block="+b);
    }
	public static void main(String[] args) {
		
		System.out.println("Main method called");
		StaticDemo.methodB();
		StaticDemo obj=new StaticDemo();
		obj.methodA();
		obj=null;//obj goes out of scope
		System.out.println("After object goes out of scope");
		System.out.println("static var="+StaticDemo.b);
		System.out.println("static method=");
		StaticDemo.methodB();
		System.out.println("insatance var="+obj.a);
		System.out.println("instance method=");
		obj.methodA();

	}

}
