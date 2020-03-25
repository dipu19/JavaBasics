package com.quantum.javabasics;

import java.util.stream.Stream;

public class ExampleOfStream {

	public static void main(String[] args)
	{
		Stream <Integer> stream = Stream.of(1,2,8,4);
		stream.forEach(System.out::println);
	}
}
