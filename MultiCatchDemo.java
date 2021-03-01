package com.training.exception;

public class MultiCatchDemo {

	public static void main(String[] args) {
		int a, b, c;
		try {
			
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a / b;
			System.out.println("Result= " + c);
			
		}
//		catch(Exception e)
//		{
//			//System.out.println(e.getMessage());
//			System.out.println("Invalid input");
//			//e.printStackTrace();
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Provide 2 values");
		} 
		catch (NumberFormatException e) {
			System.out.println("Provide only numbers");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		} 
		catch (Exception e) {
			// System.out.println(e.getMessage());
			System.out.println("Invalid input");
			//e.printStackTrace();
		}
		finally
		{
			//conn.close();
			System.out.println("Executed always");
		}

	}

}
