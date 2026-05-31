package com.exceptionExample;

public class StringToInteger {

	public static void main(String[] args) {
		
		try{
			
			String str2 = "123";
			System.out.println("conver the input String2 to Intger : " + Integer.valueOf(str2));
			
			String str1 = "Shrii";
			
			
			System.out.println("conver the input String1 to Intger " + Integer.parseInt(str1));
			
		}
		catch(NumberFormatException e){
			
			System.out.println("Invalid Number");
		}

	}

}
