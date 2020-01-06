package com.quantum.javabasics;
//Calling Garbage Collection
public class CallingGC {
	public static void main(String[] args)
	{
		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		for(int i=0;i<10000;i++)
		{
			CallingGC c=new CallingGC();
		}
		System.out.println(r.freeMemory());
		r.gc();
		System.out.println(r.freeMemory());
	}
}
