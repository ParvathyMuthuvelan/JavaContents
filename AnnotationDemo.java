package com.training.annotations;

import java.util.Date;

//@Override
class Base
{
	void show()
	{}
}
class Derived extends Base
{
//	@Override
//	void show()
//	{}
//	@Override
//	void show(int a)
//	{
//		
//	}
	@Deprecated
	void display()
	{
		
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		Date d=new Date(2020, 10, 10);

	}

}
