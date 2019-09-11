package com.quantum.javabasics;

import java.util.Scanner;

public class AtmWithdrawMachine {
	public static void main(String[] args)
	{
	
		System.out.println("Please Enter Your Pin");
		Scanner s1=new Scanner(System.in);
		 int pin=s1.nextInt();
		 final int  pin1=1003;
		 int availBalance=45182;
		  if (pin==pin1)
		  {
			  System.out.println("Enter The Amount U Want To Withdraw");
			  int amount=s1.nextInt();
			  if(availBalance>amount)
			  {
				  System.out.println("take your cash");
				  availBalance=availBalance-amount;
				  System.out.println("Your Available balance is "+availBalance);
			  }
			  else
			  {
				  System.out.println("Insufficient Balance");
			  }
		  }
		  else
		  {
			  System.out.println("Enter Correct Pin");
		  }
	}
}
