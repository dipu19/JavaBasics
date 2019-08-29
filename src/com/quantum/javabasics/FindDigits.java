package com.quantum.javabasics;

public class FindDigits {
	public static void main(String[] args)
	{
		int number=1012;
		int p=number;
		int div=0;
		int count=0;
		while(p>0)
		{
			div=p%10;
			p=p/10;
			try
			{
			if(number%div==0)
			{
				count=count+1;
			}
			}
			catch(ArithmeticException e)
			{
				
			}
		}System.out.println(count);
	}

}
