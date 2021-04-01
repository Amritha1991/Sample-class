package com.testing;

public class ClassDetails {

	public void morningClass() {
    String abc = "doing Git practice";
    System.out.println(abc.toUpperCase().lastIndexOf(abc));
 
	}
	
public void classmembers() {
	int c=1;
	 for (int i=1; i<=5; i++) {
		 c=c*i;
		
	 }

	 System.out.println("Fibacci series :" + c);
	 
}

 public static void main(String[] args) {
	
	 ClassDetails java= new ClassDetails();
	 
	java.morningClass();
    java.classmembers();
 }
}

