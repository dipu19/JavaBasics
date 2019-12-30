package com.quantum.javabasics;

import java.util.TreeMap;

//Example on tree map
public class TreeMapExample {
	public static void main(String[] args)
	{
		TreeMap<Integer,String> sm=new TreeMap<Integer,String>();
		sm.put(0,"Bou");
		sm.put(2,"Bapa");
		sm.put(1,"maa");
		System.out.println(sm);
	}
}
