package com.training.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExcepDemo {

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader reader=new BufferedReader(ir);
		int a,b,c;
		System.out.println("Enter 2 number");
		//try {
			a=Integer.parseInt(reader.readLine());
			b=Integer.parseInt(reader.readLine());
			c=a+b;
			System.out.println("sum ="+c);
//		} catch (IOException e) {
//			
//			System.out.println(e.getMessage());
//		}
	}

	}
	// throw,throws(propagating the exception to the calling environment)
//	main-->method1()->method2()-->method3() (exception can be handled locally within the method or you can
		//	propagate the exception to the calling method)
	/*main() throws IOException
	{
		method1();
	}
	method1() throws IOException
	{
		method2();
	}
	method2() throws IOException
	{
		method3();
	}
	method3() throws IOException
	{
		try
		{}
		catch() {}
	}

}*/





