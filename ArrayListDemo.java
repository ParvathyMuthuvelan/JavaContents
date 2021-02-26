package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		System.out.println("size of list=" + list.size());
		list.add(new Integer(10));
		list.add(20);
		list.add("one");
		list.add(10);
		list.add(10);
		list.add(new Double(45.89));
		list.add(null);
		list.add("two");
		System.out.println("After adding size of list=" + list.size());
		System.out.println("List =" + list);
		list.add("three");
		System.out.println("Index of 10=" + list.indexOf(10));
		System.out.println("Index of last occurrence of 10=" + list.lastIndexOf(10));
		System.out.println("List contains 10=" + list.contains(10));
		System.out.println("List contains 30=" + list.contains(30));
		System.out.println("third element=" + list.get(2));

		list.set(3, "modified element");
		System.out.println("After changing 4th element =" + list);
		list.add(2, "new element");
		System.out.println("After inserting new element in 2nd index=" + list);
		ArrayList list1 = new ArrayList();
		list1.add("one");
		list1.add("two");
		System.out.println("List 1=" + list1);
		list1.addAll(list);
		System.out.println("After appending list to list1 " + list1);
		list1.remove(3);
		list1.remove("one");
		System.out.println("After removing 4th element " + list1);
		list1.clear();
		System.out.println("After clearing list1 " + list1);
		System.out.println("Traversing the list using index-for loop");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			Object obj = list.get(i);
			System.out.println(obj);
			// System.out.println(list.get(i));
		}
		System.out.println("Traversing the list using for-each loop");
		for (Object var : list) {
			System.out.println(var);
		}
		System.out.println("Traversing the list using iterator");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);

			// System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Traversing the list using list iterator in forward direction");
		ListIterator litr = list.listIterator();
		while (litr.hasNext()) {
			Object obj = litr.next();
			System.out.print(obj + " ");

			// System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Traversing the list using list iterator in backward direction");

		while (litr.hasPrevious()) {

			System.out.print(litr.previous() + " ");
		}
	}

}
