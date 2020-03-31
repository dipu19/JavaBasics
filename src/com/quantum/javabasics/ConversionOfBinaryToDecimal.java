package com.quantum.javabasics;

import java.util.ArrayList;

public class ConversionOfBinaryToDecimal {

	public void conversion(int  number)
	{
		ArrayList <Integer>ar =new ArrayList<Integer>();
		double  result = 0;
		while(number >0)
		{
			ar.add(number%10);
			number = number/10;
			
		
		}
		for(int  i= 0;i<ar.size();i++)
		{
			result = result+(Math.pow(2,i)*ar.get(i));
			
		}
		
		System.out.println((int)result);
	}
	public static void main(String[] args)
	{
		ConversionOfBinaryToDecimal object = new ConversionOfBinaryToDecimal();
		object.conversion(11110);
	}
}
