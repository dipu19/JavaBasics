package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreationUsingList {

	public static void main(String[] args)
	{
		ArrayList <Integer>arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(9);
		arr.add(7);
		Stream stream = arr.stream();
		stream.forEach(System.out::println);
	}
}
