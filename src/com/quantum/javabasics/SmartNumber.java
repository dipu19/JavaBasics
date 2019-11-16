package com.quantum.javabasics;
import java.util.*;
public class SmartNumber {
	public static boolean isSmartNumber()
	{
		System.out.println("Enter number here");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count =0;
	    boolean st=true;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
				{
					count++;
				}
			}
			
		}if(count==0)
		{
			st=true;
		}else
			{
			
			if(count>0)
			{
				st=false;
			}
			}
			return st;	
	}
	public static void main(String[] args)
	{
		System.out.println(SmartNumber.isSmartNumber());
	}
}
