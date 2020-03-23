package com.quantum.javabasics;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

	public void iterateUsingWhileLoop()
	{
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Dipu", 1);
		hm.put("Sipu", 3);
		hm.put("Jay", 4);
		Iterator itr =   hm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	public void iterateUsingForLoop()
	{

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Dipu", 1);
		hm.put("Sipu", 3);
		hm.put("Jay", 4);
				
		for(Map.Entry me2:hm.entrySet())
		{
			System.out.println("key is "+me2.getKey()+" value is "+me2.getValue());
		}
		
	}
	public static void main(String[] args)
	{
		IterateHashMap object = new IterateHashMap();
		object.iterateUsingWhileLoop();
		object.iterateUsingForLoop();
		
	}
}
