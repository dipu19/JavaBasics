package com.quantum.javabasics;

import java.util.ArrayList;

//How to use of ListIterator.
public class ListIterator {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(8);
		al.add(10);
		java.util.ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			
			Integer i=li.nextIndex();
			if(i==5)
			{
			li.remove();
		}
			for(int j=0;j<al.size();j++)
			{
				System.out.println(al.get(j));
			}
		}
		
	}
}
