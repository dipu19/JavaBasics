package com.quantum.javabasics;

public class CheckArmstrong {

	public void checkArmstrong(int number)
	{
		int sum = 0;
		double num = number;
		int numCopy = number;
		double count = 0;
		
		while(numCopy != 0)
		{
			count++;
			numCopy = numCopy/10;
		}
		while(num!= 0)
		{
			double digit = num%10;
		    int res = (int)Math.pow(digit, count);
		    num = (int)(num/10);
		    sum = sum+res;
		    //System.out.println(num);
		}
		
		if((int)sum == number)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
	public static void main(String[] args)
	{
		CheckArmstrong obj = new CheckArmstrong();
		obj.checkArmstrong(123);
	}
}
