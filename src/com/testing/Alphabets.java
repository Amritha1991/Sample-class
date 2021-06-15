package com.testing;

public class Alphabets {
	
	public static void main(String[] args) {
		
		String str="adjkhskjfh23328748973";
				
	String l="";
	int le=0;int  di=0;
	String d="";
	
		for(int i=0; i< str.length(); i++) {
			
			char c= str.charAt(i);
			
			if(Character.isLetter(c)) {
				
				l=l+c;
				le++;
				
			}		
			else {
				
				d=d+c;	
				di++;
				
			}
		
		}		
		System.out.println("letter :"+ l + "\n" + "digits" + d);
		
		System.out.println(le);
		System.out.println(di);
	
	}
	
}