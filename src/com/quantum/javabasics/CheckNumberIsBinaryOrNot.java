package com.quantum.javabasics;

public class CheckNumberIsBinaryOrNot {

	public void check(long number)
	{
		System.out.println(number);
		
		int count = 0;
		int digit =0;
		
		while(number != 0)
		{
			if(number%10 == 0 ||number%10 == 1)
			{
				count++;
			}
			digit++;
			number = number/10;
			
		}
		
		
		if(count == digit )
		{
			System.out.println("The number is binary number");
		}
		else
		{
			System.out.println("The number is not binary number");
		}
		
	
	}
	public static void main(String[] args)
	{
		CheckNumberIsBinaryOrNot object = new CheckNumberIsBinaryOrNot();
		
		object.check(1100);
	}
}
