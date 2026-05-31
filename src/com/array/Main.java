package com.array;

public class Main {

	public static void main(String[] args) {
		
		Days today = Days.WEDNESDAY;
        System.out.println("Today is: " + today);
        
        System.out.println("All days of the week:");
        for(Days d: Days.values())
        
        {
        	System.out.println(d);
        }
	}
	
	

}
