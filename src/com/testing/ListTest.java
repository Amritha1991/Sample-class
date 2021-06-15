package com.testing;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListTest {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m= new Hashtable<>();
		
		m.put("apple",123);
		m.put("kiwi", 124);
		m.put("t=hello", 345);
		m.put("wat", 1);
		m.put("yes", 1);
		System.out.println(m);
		
		
		
//		String name ="ABC";
//		String compare= "abc";
//		
//		boolean equals = name.equals(compare);
//			
//		System.out.println(equals);
//		
//		boolean equalsIgnoreCase = name.equalsIgnoreCase(compare);
//		System.out.println(equalsIgnoreCase);
//		
//		int compareTo = name.compareTo(compare);
//		System.out.println(compareTo);
		

		
		
		
	}
	
}


//Set<String> se =new HashSet<>();
//
//se.add("apple");
//se.add("orange");
//se.add("kiwi");
//se.add("apple");
//se.add("kiwi");
//
//System.out.println(se);







//List<String> li = new ArrayList<>();
//
//li.add(" Mango");
//li.add("Orange");
//li.add("Grapes");
//
//	
//for (int i = 0; i < li.size(); i++) {
//	
//	System.out.println(li.get(i));
//	
//}
//
//String s1= "Amritha" ;
//
//System.out.println(System.identityHashCode(s1));