package com.training.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		  Deque<String> deque = new LinkedList<String>();
		  deque.add("one");
		  deque.add("two");
		  deque.add("three");
		  System.out.println("After adding queue="+deque);
		  deque.addFirst("first");
		  deque.addLast("last");
		  System.out.println("After adding queue="+deque);
		  String element=deque.removeFirst();
		  System.out.println("After removing first element queue="+deque);
		  element=deque.removeLast();
		  System.out.println("After removing last element queue="+deque);
	}

}
