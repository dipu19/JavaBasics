package com.quantum.javabasics;

import java.util.ArrayList;


//Example how iterator works.
public class Iterator {
	public static void main(String[] args)
	{
		ArrayList <Integer>al=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			al.add(i);
		}
		java.util.Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			System.out.println(i);
		}
	}
}
