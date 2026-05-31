package com.array;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of rows");
		int rows = sc.nextInt();
		
		System.out.print("Enter no of columns");
		int columns = sc.nextInt();
		
		 // Initialize the 2D array 
		int[][] arr = new int[rows][columns];
		
		//reading array elements from the user  
		 System.out.println("Enter the elements of the array:");  
		 
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				
				System.out.print("Enter element for position (" + i + ", " + j + "): ");
				
			    //reading array elements one by one  
				arr[i][j] = sc.nextInt();
			}
		}
		// Printing the 2D array  
		System.out.println("The entered 2D array is:");
		
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
        sc.close();
	}

}
