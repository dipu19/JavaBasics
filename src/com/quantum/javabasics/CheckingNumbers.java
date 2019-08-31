package com.quantum.javabasics;

public class CheckingNumbers {
	public static void main(String[] args)
	{
		int number = 3;
		if (number%2 != 0)
		{
			System.out.println("Weird");
		}
		else
		{
			if(number>2&number<=5)
			{
				System.out.println("not Weird");
			}else if (number>6&number<=20)
			{
				System.out.println(" within limit");
			}else
			{
				System.out.println("not within limit");
			}
		}
	}
	
	

}
