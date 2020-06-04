package com.quantum.javabasics;

import java.util.ArrayList;

public class ListIteratorExample {

	public static void main(String[] args)
	{
		ArrayList <String>array = new ArrayList<String>();
		
		for(int i=0;i<10;i++)
		{
			String str = "index no is "+i;
			
			array.add(str);
		}
		
		java.util.ListIterator<String> itr = array.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
