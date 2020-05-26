package com.quantum.javabasics;

import java.util.ArrayList;

public class LRUCache {

	ArrayList <Integer>cacheArrayList = new ArrayList<Integer>(5);
	
	public void addInCache(int element)
	{
		
		
		int length = cacheArrayList.size();
		//System.out.println("length "+length);
		if(length<5)
		{
			cacheArrayList.add(length,element);
		}
		else
		{
			if(length == 5)
			{
				cacheArrayList.remove(0);
				cacheArrayList.add(4,element);
			}
		}
		System.out.println(cacheArrayList);
		
		
	}
	
	public static void main(String[] args)
	{
		LRUCache obj = new LRUCache();
		
		obj.addInCache(1);
		obj.addInCache(2);
		obj.addInCache(1);
		obj.addInCache(2);
		obj.addInCache(2);
		obj.addInCache(3);
		obj.addInCache(6);
		obj.addInCache(8);
	}
}
