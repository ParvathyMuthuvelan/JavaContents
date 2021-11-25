package com.training.ooc;

class Outer {
	private int outerVar = 10;

	void createInnerObject()
	{
		System.out.println("instantiating inner class object within a method");
		Inner obj=new Inner();
		obj.accessOuter();
	}
	class Inner {
		void accessOuter() {
			System.out.println("Outer class var=" + outerVar);
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// Inner innerObj=new Inner(); error
		Outer outerObj = new Outer();
		Outer.Inner innerObj = outerObj.new Inner();
		innerObj.accessOuter();
		outerObj.createInnerObject();

	}

}
