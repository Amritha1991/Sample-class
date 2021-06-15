package com.testing;

import java.util.Arrays;

public class StringMethod {
	
	public static void main(String[] args) {
		
		
		String s= "You Are An Idiot";
		String res="";
		
		String[] ch = s.split(" ");
		
		System.out.println(Arrays.toString(ch));
		
		for (String st : ch ) {
			
			System.out.println(st);
			
			String rev="";
			
			for( int i=st.length()-1; i>=0; i--) {
				
				char c= st.charAt(i);
				
				rev= rev+c;
				System.out.println(rev);
			
			}
			
			res= res +rev +" ";
			
					
		}
		
		System.out.println(res);
		
		
		
		
		
		
	}}