package com.exceptionExample;

public class OverloadQuiz {

	 public static void method(Object o) {
		 System.out.println("Object version"); } 
		public static void method(String s) { 
		System.out.println("String version"); } 
		public static void main(String[] args) { 
		method(null); 
		}
		 }


