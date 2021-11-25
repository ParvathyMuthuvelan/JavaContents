package com.training.ooc;

class OuterClass {
	private int outerVar = 5;
	private static int outerStaticVar = 10;

	static class InnerClass {
		void accessOuter() {
			// System.out.println("outer class var="+outerVar);
			System.out.println("outer class static var=" + outerStaticVar);
		}
	}
}

public class StaticInnerClassDemo {

	public static void main(String[] args) {
		OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
		innerObj.accessOuter();

	}

}
