package com.java8.methodref;

import java.util.function.BiFunction;

public class MethodRefDemo {
	//merger=MethodRefDemo::appendStrings;
	//merger.apply()
	// mergeThings("Hello ", "World!", (a, b) -> a + b)
	public static  String mergeThings(String a, String b, BiFunction<String, String, String> merger) {
        return merger.apply(a, b);
    }
//merger=MethodRefDemo::appendStrings;
    public static String appendStrings(String a, String b) {
        return a + b;
    }
    
    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        MethodRefDemo myApp = new MethodRefDemo();

        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodRefDemo.
            mergeThings("Hello ", "World!", (a, b) -> a + b));
      
        // Reference to a static method
        System.out.println(MethodRefDemo.
            mergeThings("Hello ", "World!", MethodRefDemo::appendStrings));

        // Reference to an instance method of a particular object        
        System.out.println(MethodRefDemo.
            mergeThings("Hello ", "World!", myApp::appendStrings2));
        
        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(MethodRefDemo.
            mergeThings("Hello ", "World!", String::concat));
    }
}

