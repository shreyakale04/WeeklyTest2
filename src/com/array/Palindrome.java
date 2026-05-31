package com.array;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String s = "Madamji";
		String rev = "";
		
		s = s.toLowerCase();
		
		for(int i = s.length()-1; i>=0; i--){
			rev+=s.charAt(i);
			
			
		}
//	System.out.println(rev);
		if(s.equals(rev)){
			
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
	}

}
