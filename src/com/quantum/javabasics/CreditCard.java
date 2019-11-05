package com.quantum.javabasics;

import java.util.Scanner;


	public class CreditCard {
		public static void main(String[] args)
		{
			 System.out.println("Enter pin");
			 Scanner reader=new Scanner(System.in);
			 int pin=reader.nextInt();
			 final int pincode=1003;
			 final int expYear=2025;
			 final int expMonth=9;
			 int balance=450200;
			 if(pin==pincode)
			 {
				 System.out.println("Enter exp year");
				 Scanner t1=new Scanner(System.in);
				 int year=t1.nextInt();
				 if(year==expYear)
				 {
					 System.out.println("Enter exp month");
					 Scanner t2=new Scanner(System.in);
					  int month=t2.nextInt();
					 if(month==expMonth)
					 {
						 System.out.println("Your Balance is "+balance);
					 }
				     else
				     {
				    	 System.out.println("You have entered wrong month.");
				     }
					 }
				 else
				 {
					 System.out.println("You have entered wrong year.");
				 }
			 }
			 else 
			 {
				 System.out.println("You have entered wrong pin.");
			 }
			 System.out.println("Thank you");
		}
}
