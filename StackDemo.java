package com.training.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// creating an instance of Stack class
		Stack<Integer> stk = new Stack<>();
		// checking stack is empty or not
		System.out.println("stack is empty =" + stk.empty());
		// pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);

		System.out.println("Elements in Stack: " + stk);
		System.out.println("stack is empty =" + stk.empty());
		System.out.println("Top element=" + stk.pop());
		System.out.println("Elements in Stack: " + stk);

	}
}