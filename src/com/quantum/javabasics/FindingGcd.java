package com.quantum.javabasics;

public class FindingGcd {
	
	static int gcd(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		if(b==0)
		{
			return a;
		}
		if(a==0&b==0)
		{
			return 0;
		}
		if(a>b)
		{
			return gcd(a-b,b);
		}
		
		
			return gcd(a,b-a);
		
		
	}
	public static void main(String[] args)
	{
		FindingGcd fg=new FindingGcd();
		System.out.println(fg.gcd(2, 6));
	}
}
