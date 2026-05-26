package com.array;

public class SumOfArray {

	public static void main(String[] args) {
		
//		int[] arr1 = {8, 7, 2, 5, 3, 1};
		int[] arr2 = {5, 2, 6, 8, 1, 9};
		
//		int target = 10;
		int target2 = 12;
		boolean flag = false;
		
		for(int i = 0; i<arr2.length; i++){
			for(int j = i+1; j<arr2.length; j++){
				
				if(arr2[i] + arr2[j] == target2){
					
					System.out.println("Pair found (" 
                  + arr2[i] + ", " + arr2[j] + ")");
					
					flag = true;
					
					break;
				}
				
				}
			}
		if(!flag){
			System.out.println("Pair not found");
		}
		}
				
//		for(int i = 0; i<arr1.length; i++){ //8
//		 for(int j = i+1; j<arr1.length; j++)	{ //7
//		 
//			 
//			if(arr1[i] + arr1[j] == target ){
//				
//				System.out.println("Pair found (" 
//                        + arr1[i] + ", " + arr1[j] + ")");
//				
//				flag = true;
//				}
//		 }
//			
//		}
//				
//			
//		
	}

	


