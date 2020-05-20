package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MakeSynchronizedArrayList {

	public static void main(String[] args) throws InterruptedException
	{
		ArrayList <Integer>arrayList = new ArrayList<Integer>();
		
		Set <Integer>set = new HashSet<Integer>();
		
		Map <Character,Integer>map = new HashMap<Character,Integer>();
		
		List <Integer> synchronizedArraysList = Collections.synchronizedList(arrayList);
		
		Map <Character,Integer> synchronizedMap = Collections.synchronizedMap(map);
		
		Set <Integer> synchronizedSet = Collections.synchronizedSet(set);
		
		System.out.println("arrayList conerted to syncronizedArrayList");
		
		Thread.sleep(1000);
		
		System.out.println("map conerted to syncronizedMap");
		
		Thread.sleep(1500);
		
		System.out.println("set conerted to syncronizedSet");
		
		Thread.sleep(2000);
	}
}
