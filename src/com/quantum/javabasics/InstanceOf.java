package com.quantum.javabasics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class InstanceOf {

	public static void main(String[] args)
	{
		ArrayList <Integer>arrayList = new ArrayList<Integer>(); 
		
		LinkedList <Integer>linkedList = new LinkedList<Integer>();
		
		System.out.println(linkedList instanceof RandomAccess);
		
		System.out.println(arrayList instanceof Serializable);
		
	}
}
