package com.training.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		System.out.println("comparing string literals with =="+(s1==s2));
		System.out.println("comparing string literals with equals "+s1.equals(s2));
		String s3=new String("world").intern();
		String s4=new String("world").intern();
		System.out.println("comparing string objects with =="+(s3==s4));
		System.out.println("comparing string objects with equals "+s3.equals(s4));
		

	}

}
