package com.training.strings;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
	
		StringJoiner joiner = new StringJoiner(",", "[", "]");
		StringJoiner joiner1 = new StringJoiner("-");
		joiner.add("one");
		joiner.add("two");
		joiner.add("three");
		joiner.add("four");
		joiner.add("five");
		
		joiner1.add("one");
		joiner1.add("two");
		joiner1.add("three");
		joiner1.add("four");
		joiner1.add("five");
		String result = joiner.toString();
		 
		System.out.println(result);
		String result1 = joiner1.toString();
		 
		System.out.println(result1);


	}

}
