package com.quantum.javabasics;

import java.util.Date;
import java.util.stream.Stream;

public class ExampleOfStreamUsingArray {

	public static void main(String[] args)
	{
		
		Stream<int[]>stream = Stream.of(new int[] {1,4,5,4});
		stream.forEach(p->System.out.println(p));
		Stream<Date> stream1 = Stream.generate(()->{return new Date();});
		
		stream1.forEach(p->{
			{
				System.out.println(p);
				
				
			}
		});
	}
}
