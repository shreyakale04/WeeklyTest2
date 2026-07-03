package com.array;

public class MinSubArray {

	public int minSubArray(int[]arr){
		
		int current = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++){
			
			current = Math.min(arr[i], current + arr[i]);
			min = Math.min(min, current);
				
	
		}
		return min;
	}
	public static void main(String[] args) {
		
		int[]arr = {-2,1,-3,4,-1,2,2,-5,3};
		MinSubArray m = new MinSubArray();
		
		int result = m.minSubArray(arr);
		System.out.println(result);

	}

}
