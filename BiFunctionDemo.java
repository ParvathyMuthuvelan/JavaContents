package com.java8.funcinterfaces;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/*interface funcinter
{
void method();	
}
funcinter ref=()->{};
ref.method();*/
public class BiFunctionDemo {

	public static void main(String args[]) {
		
		        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
		        System.out.println("condition1="+pr.test(10));    // Calling Predicate method  
		        System.out.println("condition2="+pr.test(20)); 
		 
		// BiFunction to add 2 numbers
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		// Implement add using apply()
		System.out.println("Sum = " + add.apply(2, 3));

		// BiFunction to multiply 2 numbers
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

		// Implement add using apply()
		System.out.println("Product = " + multiply.apply(2, 3));
	}
}
