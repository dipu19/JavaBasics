package com.quantum.javabasics;
import java.util.*;
public class NonDivisibleSubSet {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of arraylist");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the values to arraylist");
		
		ArrayList <Integer>s=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			s.add(sc.nextInt());
		}
         System.out.println("Enter the value of k");
         int k=sc.nextInt();
		int count=0;
		for(int i=0;i<s.size();i++)
		{
			for(int j=i+1;j<s.size();j++)
			{
				if((s.get(i)+s.get(j))%k==0)
				{
					count++;
				}
			}
		}System.out.println(count);
	}
}
