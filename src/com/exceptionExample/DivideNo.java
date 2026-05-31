package com.exceptionExample;

public class DivideNo {

	public static void main(String[] args) {
	
	try{
			int a = 10;
			int b = 2;
			int result1 = a/b;
			System.out.println("Result1 : " + result1);
			
			int c = 10;
			int d = 0;
			int result2 = c/d;
			System.out.println("Result2 : " + result2);
			
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
	}

}
