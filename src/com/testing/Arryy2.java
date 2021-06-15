package com.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Arryy2 {
	
	public static void main(String[] args) {
		
		// removal of index value from Array
		
		int [] a1= {1, 20, 30, 75, 56, 89, 90};
		
		System.out.println("Orginal array ==>" + Arrays.toString(a1));
		
//		int removeIndex = 3;
		
		System.out.println("Length of ==>" + a1.length);
		System.out.println(Arrays.binarySearch(a1, 56));
		
		for( int i= 3; i < a1.length-1; i++) {
			
			a1[i] = a1 [i+1] ;
			
		}
		
		System.out.println(" After index removal =>" + Arrays.toString(a1) );
		
		Integer [] b= {45, 55, 65, 75, 85, 95 };
		
		List li=Arrays.asList(b);
		System.out.println(li);
		
	    
		
		
//		List<String> li =Arrays.asList(Arrays.toString(b));
//		
//		System.out.println(li);
//		String a= li.remove(2);
//		
//		System.out.println("after removal 2nd index ==>" + a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        		
//		System.out.println(a1);
		
//		int add= 1;
//		System.out.println("copy of :" + Arrays.toString(Arrays.copyOf(a1, add)));
		
//		int add1=75;
//		
//		System.out.println(add1 + " at index of  " + Arrays.binarySearch(a1, add1));
//		
//		int [] b= { 34, 45, 67, 78, 89, 12};
//		
//		System.out.println("Comparision of " + Arrays.equals(a1, b));
		
//		int add2 = 100;
//		
//		Arrays.fill(a1, add2);
		
//		System.out.println("Filling the values "+ Arrays.toString(a1));
//				System.out.println("Matching the values ");
		
		
//		System.out.println("Original array==> "+Arrays.toString(a1));
//		int add3 = 1;
//		
//		for (int i= add3; i <=a1.length-1; i++ ) {
//			
//			a1[i] = a1[i+1];
//		}
//		
//		System.out.println("After removal " + Arrays.toString(a1));
	 
		
//		 int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//		   
//		   System.out.println("Original Array : "+Arrays.toString(my_array));     
//		   
//		  // Remove the second element (index->1, value->14) of the array
//		   int removeIndex = 1;
//
//		   for(int i = removeIndex; i < my_array.length -1; i++){
//		        my_array[i] = my_array[i + 1];
//		      }
//		// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
//		    System.out.println("After removing the second element: "+Arrays.toString(my_array));
//		
		
	}

}
