package com.training.wrapper;

public class CharacterWrapper {

	public static void main(String[] args) {
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println("b is a digit="+Character.isDigit('b'));
		System.out.println("2 is a digit="+Character.isDigit('2'));
		System.out.println("* is a digit="+Character.isDigit('*'));
		System.out.println("a is a letter="+Character.isLetter('a'));
		System.out.println("5 is a letter="+Character.isLetter('5'));
		System.out.println("3 is a letter or digit="+Character.isLetterOrDigit('a'));
		System.out.println("$ is a letter or digit="+Character.isLetterOrDigit('$'));
		System.out.println("A is in lowercase="+Character.isLowerCase('A'));
		System.out.println("A is in uppercase="+Character.isUpperCase('A'));
	}

}
