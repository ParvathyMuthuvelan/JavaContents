package com.training.java8;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class OptionalDemo {
	public static void main(String[] args) {

		Integer value1 = null;
		Integer value2 = new Integer(10);

		//Optional<Integer> method
//Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);
		System.out.println(a);
//Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		System.out.println(b);
		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

//Optional.orElse - returns the value if present otherwise returns
//the default value passed.
		Integer obj1 = a.orElse(new Integer(0));
		System.out.println(obj1);
//Optional.get - gets the value, value should be present
		Integer obj2 = b.get();
		System.out.println("obj2="+obj2);
		String s="helloworld";
		//String s=null;
		//System.out.println(s.length());
		
		  Optional<String> opt = Optional.ofNullable(s);
		    opt.ifPresent(name -> System.out.println("length="+name.length()));
		  List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
		 // List<String> companyNames=null;
		 //  long count=companyNames.stream().count();
	 /// System.out.println(companyNames.size());
		    	    Optional<List<String>> listOptional = Optional.ofNullable(companyNames);

		    	    int size = listOptional.map(List::size).orElse(0);
		    	    System.out.println("count="+size);
	}
}
