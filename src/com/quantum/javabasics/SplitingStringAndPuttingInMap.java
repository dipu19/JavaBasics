package com.quantum.javabasics;

import java.util.HashMap;

public class SplitingStringAndPuttingInMap {

	public void stirngIntoMap(String str)
	{
		String token[] = str.split(" ");
		
		HashMap <String,Integer> hs = new HashMap<String,Integer>();
		for(int i=0;i<token.length;i++)
		{
			if(hs.containsKey(token[i]))
			{
				int value = hs.get(token[i]);
				hs.replace(token[i], value+1);
			}
			else
			{
				hs.put(token[i], 1);
			}
		}
		System.out.println(hs);
		
	}
	public static void main(String[] args)
	{
		SplitingStringAndPuttingInMap object = new SplitingStringAndPuttingInMap ();
		object.stirngIntoMap("This this is is done by Saket Saket");
	}
}
