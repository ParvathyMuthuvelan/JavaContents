package com.training.ooc;
class Person
{}
class Studentt extends Person
{}
class Baseclass
{
	Person getPerson()
	{
		Person p=new Person();
		return p;
	}
}
class Derivedclass extends Baseclass
{
	Studentt getPerson()  //Studentt is a covariant type of Person
	{
		//Person p=new Person();
		Studentt s=new Studentt();
		return s;
	}
}
class Temp
{
	}
public class OverrideDemo2 {

	public static void main(String[] args) {
		 Person p=new Person();
		 Studentt s=new Studentt();
		 Baseclass b=new Baseclass();
		 Temp t=new Temp();
		 System.out.println("p is an instance of Person="+(p instanceof Person));
		 System.out.println("p is an instance of Studentt="+(p instanceof Studentt));
		 System.out.println("s is an instance of Person="+(s instanceof Person));
		 System.out.println("s is an instance of Studentt="+(s instanceof Studentt));
		 System.out.println("s is an instance of Object="+(s instanceof Object));
		 System.out.println("p is an instance of Object="+(p instanceof Object));
		 System.out.println("b is an instance of Object="+(b instanceof Object));
		 System.out.println("t is an instance of Object="+(t instanceof Object));
		// System.out.println("t is an instance of Person="+(t instanceof Person));
		//Object casting
		 //Upcasting(Implicitly)
		 Person p1=new Person();
		 Studentt s1=new Studentt();
		 p1=s1;
		 
		 Person p2=new Person();
		 Studentt s2=new Studentt();
		 s2=(Studentt) p2;//not a valid casting(ClassCastException)
		 
		//Downcasting
		 Person p3=new Studentt();
		 Studentt s3=new Studentt();
		 s3= (Studentt) p3;

	}

}
