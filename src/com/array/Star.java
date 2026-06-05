package com.array;

public class Star {

	public static int getValue() {
		 int x = 10; try { 
		return x; 
		}
		 finally {
		 x = 20;
		 } } 
		public static void main(String[] args) { 
		System.out.println(getValue()); 
		} 
		}

