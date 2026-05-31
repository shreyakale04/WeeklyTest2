package com.array;

public class Largest {

	public static void main(String[] args) {
		
		int[] arr = {10,20, 22, 30, 77};
		
		int larg = arr[0];
		int small = arr[0];
		
		for(int i = 0; i<arr.length; i++){
			
		if(arr[i] > larg){
			
			larg = arr[i];
			
		}
		else if(arr[i] < larg){
			
			small = arr[i];
		}
		
	}
		
		System.out.println("Largest element " + larg);
	  System.out.println("Smallest element " + small);
		
	}

}
