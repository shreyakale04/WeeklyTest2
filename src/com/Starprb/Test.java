package com.Starprb;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		

			String str = "pro*gr**ams*";
			Stack<Character>stack = new Stack<>();
			
			
			for(char ch : str.toCharArray()){
					
			     		if(ch == '*'){
						if(!stack.isEmpty()){
							stack.pop();
							
						}
						}
					else{
						stack.push(ch);
			}
			}
			StringBuilder result = new StringBuilder();
			for(Character c :stack){
				result.append(c);
				
			}
			System.out.println(result);
			System.out.println(result.reverse());
			}
			
			
			

	}

