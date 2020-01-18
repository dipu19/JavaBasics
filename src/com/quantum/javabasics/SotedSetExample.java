package com.quantum.javabasics;

import java.util.*;

//Example on Sorted map 
public class SotedSetExample {
	public static void main(String[] args)
	{
		SortedMap <Integer,String>sm=new TreeMap<Integer,String>();
		sm.put(1,"Dipu");
		sm.put(0,"Sipu");
		sm.put(2,"Tossali");
		sm.put(3,"Tapash");
		System.out.println(sm);
		System.out.println(sm.lastKey());
		
	}
}
