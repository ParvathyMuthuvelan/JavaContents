package com.training.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		
		System.out.println("size=" + map.size());
		map.put("P", "null");
		map.put("C", "Chennai");
		map.put("D", "Delhi");
		System.out.println("Map elements =" + map);
		map.put("P", "Pune");
		map.put("b", "Bangalore");
		map.put("c", null);
		//map.put(null,"Value");//NPE
		
		System.out.println("After adding elements size=" + map.size());
		System.out.println("Map elements =" + map);
		System.out.println("Value of C="+map.get("C"));
		System.out.println("Value of A="+map.get("A"));
		System.out.println("Map contains key B ="+map.containsKey("B"));
		System.out.println("Map contains key A ="+map.containsKey("A"));
		System.out.println("Map contains value Delhi="+map.containsValue("Delhi"));
		//map.remove(null);
		//System.out.println("After removing null key ="+map);
		//Iterator itr=map.iterator();
		Set<Entry<String,String>> set=map.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		//Iterator<Entry<String,String>> itr=map.entrySet().iterator();
		System.out.println("Traversing map using iterator");
		while(itr.hasNext())
		{
		Entry<String,String> entry=itr.next();
			
			System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
		}
		System.out.println("Traversing map using for-each loop");
//       for(Entry<String,String> e:set)
//       {
//    	  
//    	   System.out.print(e.getKey()+" : "+e.getValue()+" ");
//       }
		 for(Entry<String,String>e:map.entrySet())
       {
	    	
	    	   System.out.print(e.getKey()+" : "+e.getValue()+" ");
	       }

	}

}
