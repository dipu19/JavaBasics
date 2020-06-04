package com.quantum.javabasics;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args)
	{
		Vector <Integer>vector = new Vector<Integer>();
		
		for(int i=0;i<10;i++)
		{
			vector.add(i);
		}
		
		Enumeration e = vector.elements();
		
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
	}
}
