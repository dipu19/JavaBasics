package com.quantum.javabasics;

import java.util.ArrayList;

public class ForEachExample {

	//forEach Example
	//basically forEach works for collection .
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(7);
		arr.add(9);
		arr.forEach(p->{
			System.out.println(p);
		});
		System.out.println();
		arr.forEach(System.out::println);
	    }
}
