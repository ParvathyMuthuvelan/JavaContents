//Creation of Student object by taking name and rollno as input with BiFunction

package com.java8.funcinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Studentt
{
	String name;
	int rollno;
	public Studentt(String name, int rollno) {
		
		this.name = name;
		this.rollno = rollno;
	}
	
}
public class BiFunctionStudentDemo {
	public static void main(String args[])
	{
		List<Studentt> studList=new ArrayList<Studentt>();
		
		
		
		BiFunction<String,Integer,Studentt> f=(name,rollno)->new Studentt(name,rollno);
		
		studList.add(f.apply("Sai",121));
		studList.add(f.apply("Sri",122));
		studList.add(f.apply("Minu",123));
		studList.add(f.apply("Mini",124));
		for(Studentt s:studList)
		{
			System.out.println("Rollno :"+s.rollno);
			System.out.println("Name :"+s.name);
		}
	}

}
