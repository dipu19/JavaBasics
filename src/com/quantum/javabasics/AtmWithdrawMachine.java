package com.quantum.javabasics;

import java.util.Scanner;

public class AtmWithdrawMachine {
	static void ex()
	{
		throw new ArithmeticException("Please Enter Correct Pin");
	}
	public static void main(String[] args)throws InterruptedException
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
				  Thread.sleep(3000);
				  System.out.println("Your Available balance is "+availBalance);
			  }
			  else
			  {
				  System.out.println("Insufficient Balance");
			  }
		  }
		  else
		  {
			  ex();
		  }
	}
}
