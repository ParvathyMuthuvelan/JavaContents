package com.training.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		int a,b,c;
//      try
//      {
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;
		System.out.println("Result= "+c);
      //}
//      catch(Exception e)
//      {
//    	 // System.out.println(e.getMessage());
//    	  e.printStackTrace();
//      }

	}
	
	//main(10)->method1(11)->method2(5)->method3(6)

}
