package com.quantum.javabasics;

public class SumOfIntegers {
	
	public static void main (String[] arg)
	{   
		int sum= 0;
		int[] a= {1,4,4,10,52};
		int al =a.length;
		for ( int i=0;i<al; i++)
		{
			sum=sum+a[i];
		}System.out.println(sum);	
	}
	
}
