package com.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Arysubstring3 {
	
	public static void main(String[] args) {
		
		String str = "Amritha completed her graduation in 2011";
		String r ="";
		
		String s[] =str.split(" ");
		
		for( int i=0; i< s.length; i++) {
			
			r= s[i] + r + "";	
			
			System.out.println(r);
		}
		
		String st1= "Amritha completed her graduation in 2011";
		String res="";
		
		for(int i=st1.length()-1;i>=0; i--) {
			
			char c = st1.charAt(i);
			
			res=res+c;			
		}
		
		System.out.println(res);
	}}

