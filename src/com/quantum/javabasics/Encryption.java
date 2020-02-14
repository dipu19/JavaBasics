package com.quantum.javabasics;

import java.util.ArrayList;

public class Encryption {

	public void encrypt(String str)
	{
		double d=0;
		int size=str.length();
		double d1=0;
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		double no=size-count;
		d=Math.sqrt(no);
		double  n=Math.round(d);
		if(n>d)
		{
			d1=n-1;
		}
		else
		{
			d1=n+1;
		}
		ArrayList <Character>ar=new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				ar.add(str.charAt(i));
			}
		}
		System.out.println((int)n+" "+(int)d1);
		System.out.println(ar.size());
		
		int n1=0;
		
		while(n1<ar.size())
		{
			int k=(int )n+n1;
			if(k>ar.size())
			{
				k=ar.size();
			}
			
		for(int i=n1;i<k;i++)
		{
			System.out.print(ar.get(i));
		}System.out.println();
		
		n1=(int)n+n1;
	   
	
		}
	}
		
	
	public static void main(String[] args)
	{
		Encryption ec=new Encryption();
		ec.encrypt("if man was meant to stay on the ground god would have given us roots");
	}
}
