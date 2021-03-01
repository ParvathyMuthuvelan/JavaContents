package com.training.exception;

public class NestedTryDemo {

	public static void main(String[] args) {
		int a, b, c=0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			try {
				c = a / b;
			} 
			catch(NumberFormatException e)
			{
				System.out.println(e.getMessage());
			}
//			catch (ArithmeticException e) {
//				System.out.println("Arithmetic Exception handled by inner try block=" + e.getMessage());
//			}//inner try-catch
			System.out.println("outer try continue execution");
			System.out.println("Result= " + c);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled by outer try block=" + e.getMessage());
		}

	}

}
