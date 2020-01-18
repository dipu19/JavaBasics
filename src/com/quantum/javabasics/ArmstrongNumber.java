package com.quantum.javabasics;

public class ArmstrongNumber {
	public static void main(String[] args)
	{  
		int number=370;
		int n1=number;
		int n2=number;
		double sum=0;
		
		int count=0;
	    while(number>0)
	    {
	    	number=number/10;
	    	count=count+1;
	    }
	 
		while(n1>0)
		{
			int d=n1%10;
			sum=Math.pow(d, count)+sum;
			n1=n1/10;
		}
		if((int)sum==n2)
		{
			System.out.println("It Is Armstrong Number");
		}
		else
		{
		
			System.out.println("It Is Not Armstrong Number");
		
		}
	}
}
