package com.Starprb;

import java.util.HashSet;

public class RemoveStar {

	public static String removeStar(String s){
		
		@SuppressWarnings("unchecked")
		HashSet<Integer>set = new HashSet();
		
		for(int i = 0; i<s.length(); i++){
			
			if(s.charAt(i)== '*'){
				set.add(i);
				set.add(i-1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<s.length(); i++){
			if(!set.contains(i)){
				sb.append(s.charAt(i));	
			}
			}
		 return sb.toString();
	}
	
	 
	
	public static void main(String[] args) {
		
       String s = "pro*gr**ams*";
       System.out.println(removeStar(s));
	}

}
