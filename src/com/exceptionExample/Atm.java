package com.exceptionExample;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int balance = 5000;
		
		System.out.println("Enter withdrawal amount: ");
		int amount = sc.nextInt();
		
		try{
			
			if(amount > balance){
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			
			balance = balance - amount;
			
			System.out.println("Withdrawal Successful");
			System.out.println("Remaining Balance = " + balance);
		}
		catch(InsufficientBalanceException e){
			
			 System.out.println(e.getMessage());
		}

		sc.close();
	}

}
