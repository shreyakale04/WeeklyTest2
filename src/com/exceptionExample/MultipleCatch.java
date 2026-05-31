package com.exceptionExample;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 30, 50, 60, 70};
		
		try{
			System.out.println("Enter arry index : ");
			int index = sc.nextInt();
			
			System.out.println("Enter Divisor : ");
			int num = sc.nextInt();
			
			int result = arr[index]/num;
			
			System.out.println("Result = " + result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Invalid Index");
		}
		catch(ArithmeticException e){
			
			System.out.println("Cannot divide by zero");
		}

		sc.close();
	}

}
