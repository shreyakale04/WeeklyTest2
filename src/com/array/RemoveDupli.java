package com.array;

public class RemoveDupli {

public static int remove(int[]arr){
	
	if(arr.length == 0)
		
		return 0;
	int i = 0;
	for(int j = 0; j<arr.length; j++){
		
		if(arr[i]!=arr[j]){
			i++;
			
			arr[i]=arr[j];
		}
	}
	return i + 1;
	
	
}	
	public static void main(String[] args) {
		
		int[]arr = {1, 2, 3, 3, 2, 4, 4, 5, 5, 1};
		int length = remove(arr);
		
		System.out.println("Unique Elements");
		
		for(int k = 0; k<length; k++){
			
			System.out.print(arr[k] + " ");
		}
		System.out.println("\nlength : " + length);

	}

}
