package com.array;

public class ReverseArray {

public int[] reverseArray(int arr[]){
	
	 int size = arr.length;
	
	  // auxiliary array for reversing the   
    // elements of the array arr  
	
	int temp[] = new int[size];
	
	int index = 0;
	
	for(int i = size - 1; i>=0; i--){
		
		temp[i] = arr[index];
		
		index = index + 1;
	}
	return temp;
	
}
public static void main(String[] args) {
	
	ReverseArray obj = new ReverseArray();
	
	int arr [] = {3, 1, 7, 8, 9};
	int len = arr.length;
	int ans [] = obj.reverseArray(arr);
	
	System.out.println("For the input array");
	
	for(int i = 0; i<len; i++){
		System.out.print(arr[i] + " ");
	}
	
	System.out.println();
	System.out.println("The reverse array is");
	
	for(int i = 0; i<len; i++){
		System.out.print(ans[i] + " ");
	}
	System.out.println("\n");
	
	//input array 2
	
	  int arr1[] = {4, 8, 3, 9, 0, 1};  
	  
	  len = arr.length;
	  int ans1[] = obj.reverseArray(arr1);
	  System.out.println("For the input array");
	 
	  for(int i = 0; i<len; i++){
	 System.out.print(arr1[i] + " ");
	  
	  } System.out.println();
	System.out.println("The reverse array is");
	
	for(int i = 0; i<len; i++){
		
		System.out.print(ans1[i] + " ");
	}
	  }
	    
}
	

