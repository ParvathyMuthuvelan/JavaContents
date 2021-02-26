package com.training.wrapper;
public class WrapperDemo {

	public static void main(String[] args) {
		int a = 10, b;
		Integer obj;
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		Integer obj3 = new Integer(10);
		// without autoboxing-unboxing
//		 obj=new Integer(a);
//		 b=obj1.intValue();
		// with autoboxing-unboxing
		obj = a;
		System.out.println("int converted to Integer=" + obj);
		b = obj1;
		System.out.println("Integer converted to int=" + b);

		System.out.println("Integer's range=" + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		System.out.println("size=" + Integer.SIZE);
		System.out.println(obj1 + " equals " + obj3 + " " + obj1.equals(obj3));
		System.out.println(obj1 + " equals " + obj2 + " " + obj1.equals(obj2));
		int res = obj1.compareTo(obj3);
		if (res == 0) {
			System.out.println("equal");
		} else if (res > 0) {
			System.out.println(obj1 + " is greater than " + obj3);
		} else {
			System.out.println(obj3 + " is greater than " + obj1);
		}
		System.out.println("Max=" + Integer.max(10, 20));
		System.out.println("Minumum=" + Integer.min(10, 20));
		// converting String to int
		String s = "123a";
		int num = Integer.parseInt(s);
		System.out.println("string converted to int=" + num);
		// int to string
		Integer i = new Integer(20);
		String str = i.toString();
		System.out.println("Integer converted to string="+str);
		Integer result = Integer.valueOf(s);
		System.out.println("string converted to Integer =" + result);
		int n = 2;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toOctalString(n));
		System.out.println(Integer.toHexString(n));

	}

}
