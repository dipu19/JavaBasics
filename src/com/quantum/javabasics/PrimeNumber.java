package com.quantum.javabasics;

public class PrimeNumber {
	public static void main(String[] args)
	{    
		int number = 17, i, flag=0;
		for(i=2; i <= Math.sqrt(number);i++)
		{
			if(number % i == 0)
			{
				System.out.println("this is not a prime no");
				flag=1;
				break;
		
			}
		}	 
		if(flag == 0)
			System.out.println("this is a prime no");
	}	
}
