package com.training.exception;

class InvalidAgeException extends Exception {
	// String message;
	InvalidAgeException(String message) {
		super(message);
		// this.message=message;
	}
}

class User {
	String name;
	int age;

//handle the exception locally within the method
	int checkAge(String name, int age) {
		try {
			if (age < 18) {
				throw new InvalidAgeException("Not eligible to vote");
			} else {
				this.name = name;
				this.age = age;
				System.out.println("You are eligible to vote");
				
			}
			
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		return 1;
		
		
	}

//propagate the exception to the calling method
	void validateAge(String name, int age) throws InvalidAgeException 
	{

		if (age < 18) {
			throw new InvalidAgeException("Not eligible to vote");
		} else {
			this.name = name;
			this.age = age;
			System.out.println("You are eligible to vote");
		}

	}
}

public class CustomExcepDemo {

	public static void main(String[] args) throws InvalidAgeException
	{
		User u = new User();
		//try {
		//	u.checkAge("A", 15);
//		} catch (InvalidAgeException e) {
//			System.out.println(e.getMessage());
//		}
//		try
//		{
		u.validateAge("A", 15);
//		}
//		catch(InvalidAgeException e)
//		{
//			System.out.println(e.getMessage());
//		}
	}

}
