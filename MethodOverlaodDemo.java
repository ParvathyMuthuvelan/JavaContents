package com.training.ooc;
class Overload
{
	int add(int a,int b)
	{
		return a+b;
	}
//	void add(int a,int b)
//	{}
	
	void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Sum="+sum);
	}
	String add(String s1,String s2)
	{
		return s1+s2;
	}
	double add(double a,double b)
	{
		return a+b;
	}
}
public class MethodOverlaodDemo {

	public static void main(String[] args) {
	Overload obj=new Overload();
	
	System.out.println("adding 2 double values="+obj.add(78.89,67.8));
	obj.add(8,9,10);
	System.out.println("adding 2 integer values="+obj.add(7,8));
	System.out.println("concatenating 2 strings="+obj.add("hello","hai"));
	}

}





