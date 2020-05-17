package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestNumberInAnInteger {

	public void findSecondHighestNumber(int number)
	{
		ArrayList <Integer>digits = new ArrayList<Integer>();
		
		while(number != 0)
		{
			int digit = number%10;
			digits.add(digit);
			number = number/10;
			
		}
		Collections.sort(digits);
		int highestDigit = digits.get(digits.size()-1);
		int secondHighestDigit = 0;
		for(int i=0;i<digits.size();i++)
		{
			if(digits.get(i)<highestDigit)
			{
				secondHighestDigit = digits.get(i);
			}
		}
		System.out.println(secondHighestDigit);
	}
	public static void main(String[] args)
	{
		int number =15332;
		SecondHighestNumberInAnInteger object = new SecondHighestNumberInAnInteger();
		object.findSecondHighestNumber(number);
	}
}
