package com.quantum.javabasics;
import java.util.*;
public class SmartNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count =0;
		
		for(int i=1;i<n;i++)
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
			System.out.println("Entered number is smart number ");
		}else
			{
			
			if(count>0)
			{
				System.out.println("Entered number is not smart number");
			}
			}
				
	}
}
