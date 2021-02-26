package com.training.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		System.out.println("size=" + map.size());
		map.put("P", "null");
		map.put("C", "Chennai");
		map.put("D", "Delhi");
		System.out.println("Map elements =" + map);
		map.put("P", "Pune");
		map.put("B", "Bangalore");
		map.put(null,"Value");
		System.out.println("After adding elements size=" + map.size());
		System.out.println("Map elements =" + map);
		System.out.println("Value of C="+map.get("C"));
		System.out.println("Value of A="+map.get("A"));
		System.out.println("Map contains key B ="+map.containsKey("B"));
		System.out.println("Map contains key A ="+map.containsKey("A"));
		System.out.println("Map contains value Delhi="+map.containsValue("Delhi"));
		//map.remove(null);
		System.out.println("After removing null key ="+map);
		//Iterator itr=map.iterator();
		//Set<String> set=map.keySet();
		//map.entrySet()
		//Iterator<String> itr=set.iterator();
		Iterator<String> itr=map.keySet().iterator();
		System.out.println("Traversing map using iterator");
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=map.get(key);
			System.out.println("Key :"+key+" Value :"+value);
		}
		System.out.println("Traversing map using for-each loop");
//       for(String key:set)
//       {
//    	   String s=key;
//    	   String value=map.get(s);
//    	   System.out.print(s+" : "+value+" ");
//       }
		 for(String key:map.keySet())
       {
	    	   String s=key;
	    	   String value=map.get(s);
	    	   System.out.print(s+" : "+value+" ");
	       }

	}

}
