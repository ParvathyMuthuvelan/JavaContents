package com.training.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer(); //capacity=16
		StringBuffer sb2=new StringBuffer("hello");//16+5=21
		StringBuffer sb3=new StringBuffer(50);//50
		System.out.println("Length of sb1="+sb1.length()+" capacity="+sb1.capacity());
		System.out.println("Length of sb2="+sb2.length()+" capacity="+sb2.capacity());
		System.out.println("Length of sb3="+sb3.length()+" capacity="+sb3.capacity());
		sb2.append("world");
		System.out.println("after append sb2="+sb2);
		sb1.append("hai").append(45).append(56.78).append(true);
		System.out.println("After append sb1="+sb1);
		System.out.println(sb2);
		sb2.deleteCharAt(1);
		System.out.println("After deleting 2nd character sb2="+sb2);
		System.out.println(sb1);
		sb1.delete(2, 5);
		System.out.println("After deleting 2nd to 5th character sb1="+sb1);
		sb3.append("testbuffer");
		System.out.println("sb3="+sb3);
		sb3.insert(3, '*');
		System.out.println("After inserting char in sb3="+sb3);
		sb3.insert(5, "new");
		System.out.println("After inserting string in sb3="+sb3);
		sb3.setCharAt(3, '#');
		System.out.println("After changing char in sb3="+sb3);
		System.out.println("Length of sb3="+sb3.length()+" capacity="+sb3.capacity());
		sb3.trimToSize();
		System.out.println("After trim Length of sb3="+sb3.length()+" capacity="+sb3.capacity());
		System.out.println("Reversed string="+sb2.reverse());
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer s2=new StringBuffer("hello");
		System.out.println(s1.equals(s2));
		String str1=s1.toString();
		String str2=s2.toString();
		System.out.println(str1.equals(str2));
	}

}
