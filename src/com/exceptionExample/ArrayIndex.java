package com.exceptionExample;

public class ArrayIndex {

	public static void main(String[] args) {
		
		try{
			
			int[]arr = new int[5];
			System.out.println(arr[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Invalid Index");
		}

	}

}
