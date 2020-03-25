package com.quantum.javabasics;

public class RecursionExample {

	public int rec(int x,int y)
	{
		if(x == 0)
		{
			return y;
		}
		else
		{
			return rec(x-1,x+y);
		}
	}
	public static void main(String[] args)
	{
		RecursionExample object = new RecursionExample();
		System.out.println(object.rec(5, 4));
	}
}
