package com.training.strings;

public class StringDemo {

	public static void main(String[] args) {
	String s1="hello";
	String s2="world";
	//immutable
	System.out.println("String");
	System.out.println("Before concat hashcode of s1="+s1.hashCode());
     s1=s1+s2;
     System.out.println("After concat hashcode of s1="+s1.hashCode());
     //StringBuffer s="hello";
     StringBuffer sb1=new StringBuffer("hello");
     StringBuffer sb2=new StringBuffer("world");
     //mutable
     System.out.println("StringBuffer");
     System.out.println("Before concat hashcode of sb1="+sb1.hashCode());
    //sb1=sb1+sb2;
     sb1=sb1.append(sb2);
     System.out.println("After concat hashcode of sb1="+sb1.hashCode());
	}

}
