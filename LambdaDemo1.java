package com.training.java8;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
//SAM- single abstract method
@FunctionalInterface
interface FuncInter1 {
	int operation(int a, int b);
	//void show();

}

@FunctionalInterface
interface FuncInter2 {
	void sayMessage(String message);
}

@FunctionalInterface
interface FuncInter3 {
	void show();
}

class Sample implements FuncInter1 {

	@Override
	public int operation(int a, int b) {
		return a + b;
		// System.out.println(a+","+b);
	}
}

/*
 * lambda operator -> body Zero parameter: () ->
 * {System.out.println("Zero parameter lambda") }; One parameter
 * 
 * (p) -> System.out.println("one parameter lambda"+p);
 * 
 * Multiple parameters : (p1, p2) -> System.out.println("Multiple parameters: "
 * + p1 + ", " + p2);
 */

public class LambdaDemo1 {
	public static void main(String args[]) {
		FuncInter1 f = new Sample();
		System.out.println(f.operation(3, 4));

		FuncInter1 ref1 = (a, b) -> {
			System.out.println("method with two argument called");
			return (a * b);
		};

		System.out.println(ref1.operation(3, 2));
//		
		FuncInter2 ref2 = (str) -> System.out.println(str);

		ref2.sayMessage("hello world");
//		
		FuncInter3 ref3 = () -> System.out.println("hai");
		ref3.show();

	}

}
