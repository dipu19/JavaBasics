package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonSynchronizedToSynchronized {

	public static void main(String[] args)
	{
		ArrayList <Integer>arrayList = new ArrayList<Integer>();
		
		List <Integer>synchArrayList = Collections.synchronizedList(arrayList);
	}
}
