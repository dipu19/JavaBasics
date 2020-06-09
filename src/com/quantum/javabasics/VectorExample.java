package com.quantum.javabasics;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args)
	{
		Vector <Integer>vector = new Vector<Integer>();
		
		vector.addElement(15);
		vector.add(20);
		vector.addElement(25);
		vector.addElement(30);
		
		System.out.println(vector.get(0));
		
		System.out.println(vector.remove(0));
		
		System.out.println(vector.capacity());
		
		
	}
}
