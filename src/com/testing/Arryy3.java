package com.testing;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Arryy3 {
	
	public static void main(String[] args) {
	
		String s1="HPE has the good workplace company with good environment and the people oriented";
		
		String[] str = s1.toLowerCase().trim().split(" ");
		
		Map<String, Integer> m= new LinkedHashMap<>();
		
		for ( String st : str) {
			
			if(m.containsKey(st))  {
				
				m.put(st, m.get(st) +1);
				
					}
						else {
				
				m.put(st, 1);
						}
		}
	
	   Set<Entry<String, Integer>> en = m.entrySet();
	   
	   for(Entry<String, Integer> x : en) {
		 System.out.println(x.getKey() + "    :  "+ x.getValue());  
		    
		   
	   }
	
	
}
}


//public static void main(String[] args) {
//	
//	String str= "Hello Amritha";
//	
//		List<String> li=Arrays.asList(str.split(""));
//	
//	Set<String> se = new LinkedHashSet<>(li);
//	
//	for (String s : se) {
//		
//		System.out.println(s + " :  "  + Collections.frequency(li, s));	
		
//	}
	
//}