package com.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Arysubstring {
	
	public static void main(String[] args) {
		
		int a []  = {1,0,2,0,3,0,4,0};
		
		System.out.println("Before sorting  ");
		
		for (int i: a) {
			
			 System.out.println(i);
		}
		
		for (int i=0; i< a.length; i++) {
			
			for (int j=i+1; j< a.length; j++) {
			
				if(a[i]>a[j]) {
					 
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
								
				}}}
			System.out.println( "\n" +"After sorting   ");
			for (int i : a) {
						
				System.out.println(i);
						}
		String str = Arrays.toString(a);
		
		System.out.println(str);
		
		String res ="";
		
		String s1=str.substring(11,23);
		System.out.println(s1);
		
		String s2=str.substring(1, 11);
		System.out.println(s2);
		
		String s3=s2+s1;
		System.out.println(s3);
		
		
		
		
		
		
//		char []c1= str.toCharArray();
//		
//		System.out.println(c1);
		
//		for (int i = str.length()-1; i >=0 ; i--) {
//			
//			char c= str.charAt(i);
//			
//			System.out.println(c);	
//		}
//	
		
		
		
		
        		
		
		
		
		
//		ArrayList<String> li = new ArrayList<>(Arrays.asList(Arrays.toString(a)));
//		
//		System.out.println(li);
//		
//		Set<String> se= new HashSet<>(li);
//		
//		System.out.println(se);
//		
		
		
			
		
			}
		}
	
		
		    
		   
	   
	
	

