package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args)
	{
		ArrayList <Integer>arr = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
		{
			arr.add(i);
		}
		
		ListIterator<Integer> itr = arr.listIterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}
