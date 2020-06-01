package com.quantum.javabasics;

import java.util.ArrayList;

public class ConvertIntegerTOString {

	public static void main(String[] args)
	{
		Integer i=-10;
		
		System.out.println(i.toString()+" is in string format.");
		
		int i1=100;
		
		ArrayList <Integer>arr = new ArrayList<Integer>();
		
		String s = "";
		while(i1 != 0)
		{
			arr.add(i1%10);
			
			i1 = i1/10;
			
			
		}
		for(int j=arr.size()-1;j>=0;j--)
		{
			s = s+arr.get(j);
		}
		
		System.out.println(s);
	}
}
