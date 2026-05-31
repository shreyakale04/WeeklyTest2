package com.array;

public class Emain {

	public enum TrafficLight{RED, YELLOW, GREEN}
	
	public static void main(String[] args) {
		
		TrafficLight signal = TrafficLight.YELLOW;
		
		if(signal == TrafficLight.GREEN){
			
			System.out.println("Go!");
		}
		else if(signal == TrafficLight.RED){
			
			System.out.println("Stop!");
		}
		else if(signal == TrafficLight.YELLOW){
	 
			System.out.println("Get Ready...");
		}
		
		

}}
