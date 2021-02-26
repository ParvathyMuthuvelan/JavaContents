package com.training.collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<>();
		Set<Object> treeSet1 = new TreeSet<>().descendingSet();
		
		Set treeSet2 = new TreeSet();
		System.out.println("Before adding="+treeSet.size());
		treeSet.add("three");
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("two");
		treeSet.add("two");
		
		//treeSet.add(null); //NullPointerException
		//treeSet.add(null);
		treeSet1.add(4);
		treeSet1.add(3);
		treeSet1.add(100);
		treeSet1.add(10);
		treeSet1.add(5);
		treeSet1.add(5);
		treeSet1.add(2);
//		treeSet2.add(10);
//		treeSet2.add(10.89);
//		treeSet2.add("hello");
//		treeSet2.add(10);   //ClassCastException 

		System.out.println("Set1 elements="+treeSet);
		System.out.println("Set2 elements="+treeSet1);
		System.out.println("Set3 elements="+treeSet2);
		System.out.println("After adding elements="+treeSet.size());
		System.out.println("Set contains one="+treeSet.contains("one"));
		System.out.println("Set contains five="+treeSet.contains("five"));
	
		System.out.println("Traversing set elements with for-each");
		for(String s:treeSet)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("Traversing set elements with iterator");
		Iterator<String> itr=treeSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
