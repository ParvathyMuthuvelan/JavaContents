package com.training.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		Set<String> hashSet1 = new HashSet<>();
		System.out.println("Before adding="+hashSet.size());
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("two");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("four");
		System.out.println("Set elements="+hashSet);
		System.out.println("After adding elements="+hashSet.size());
		System.out.println("Set contains one="+hashSet.contains("one"));
		System.out.println("Set contains five="+hashSet.contains("five"));
		hashSet1.add("five");
		System.out.println("Set 2 elements="+hashSet1);
		hashSet1.addAll(hashSet);
		System.out.println("After adding set1 to set 2 elements="+hashSet1);
		hashSet1.clear();
		System.out.println("After clear ="+hashSet1);
		System.out.println("Traversing set elements with for-each");
		for(String s:hashSet)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("Traversing set elements with iterator");
		Iterator<String> itr=hashSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
