package com.quantum.javabasics;

public class UtopianTree {
	public static void main(String[] args)
	{   int height=1;
		int n=5;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				height=height*2;
			}
			else 
			{
				height=height+1;
			}
		}System.out.println(height);
	}
			

}
