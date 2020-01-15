package com.quantum.javabasics;
//finding square root of number without using function.
public class SquareRootOfNumber {

	public double sqrt(int x)
	{
		double res=0.0;
		for(int i=1;i<=x;i++)
		{
			int reminder=x/i;
			if(reminder==i&x%i==0) {
				res=i;
			}
		}return res;
	}
	public static void main(String[] arga)
	{
		SquareRootOfNumber sq=new SquareRootOfNumber();
		System.out.println(sq.sqrt(16));
	}
}
