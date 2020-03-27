package com.quantum.javabasics;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoxedStreamExample { 
	public static void main(String[] args)
	{
		Stream stream = (Stream) Stream.of("how", "to", "do", "in", "java").collect(Collectors.toList());
		stream.forEach(System.out::println);
	}
}
