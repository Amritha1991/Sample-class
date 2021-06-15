package com.testing;

public class Countofnumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		String str="123456789";
		
		int num =Integer.parseInt(str);
		System.out.println(num);
		
		int res=0, rem=0;
		
		 while(num>0) {
			
			res=num%10;
			rem=res+rem;
			num=num/10;		
			
			System.out.println(res);
			System.out.println(rem);
			System.out.println(num);
			
		}
		
		System.out.println(rem);
		
		System.out.println(System.getProperty("user.dir"));
				
	
	
	}

	
}