package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		//List<Integer> list = new LinkedList<>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(10);
		list1.add(20);
		list1.add(4);
		list1.add(30);
		list1.add(2);
		//list1.add("hello");

		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(10);
		list2.add(20);
		list2.add(5);
		list2.add(50);
		list2.add(10);
		System.out.println("Before sorting list1 =" + list1);
		Collections.sort(list1);
		System.out.println("After sorting list1=" + list1);
		Collections.reverse(list1);
		System.out.println("After reversing list1=" + list1);
		System.out.println("List 2="+list2);
		int count=Collections.frequency(list2, 10);
		System.out.println("Frequency of 10="+count);
		System.out.println("List1 =" + list1);
		System.out.println("List2 =" + list2);
		System.out.println("sublist =" + list1.subList(2, 5));
		list1.remove(2);
		list2.remove(new Integer(50));
		System.out.println("List2 =" + list2);
		System.out.println("after removing element");
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		// remove(index)
		// remove(object)
		// list1.addAll(list2);
		// System.out.println("After adding list2 to list1 ="+list1);
		//list1.retainAll(list2);
		//System.out.println("After retaining list2 elements in list1 ="+list1);
		 list1.removeAll(list2);
		 System.out.println("After removing list2 elements from list1 ="+list1);
		Iterator<Integer> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// list.add("hello");
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		// without generics -typecasting
		List l = new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		l.remove("three");
		String s[] = new String[l.size()];
		for (int i = 0; i < l.size(); i++) {
			s[i] = (String) l.get(i);
		}
		// with generics - avoid typecasting
		List<String> l2 = new ArrayList<>();
		l2.add("one");
		l2.add("two");
		l2.add("three");
		String s2[] = new String[l.size()];
		for (int i = 0; i < l.size(); i++) {
			s[i] = l2.get(i);
		}
		for (String var : l2) {
			System.out.println(var);
		}

	}

}
