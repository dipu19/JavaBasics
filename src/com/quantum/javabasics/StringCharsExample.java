package com.quantum.javabasics;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCharsExample {

	public static void main(String[] args)
	{
		IntStream stream = "abcd".chars();
		stream.forEach(p->{
			System.out.println(p);
		});
		System.out.println();
		Stream stream1 = Stream.of("abcd".split(""));
		System.out.println();
		stream1.forEach(p->System.out.println(p));
		String s= "abcde";
		System.out.println();
		Stream stream2 = Stream.of(s.split(""));
		stream2.forEach(p->System.out.println(p));
	}
}
