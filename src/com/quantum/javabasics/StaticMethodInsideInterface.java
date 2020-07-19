package com.quantum.javabasics;


interface Interface1
{
	public static void inter()
	{
		System.out.println("Hello i am in interface");
	}
}
public class StaticMethodInsideInterface {

	public static void main(String[] args)
	{
		Interface1.inter();
	}
}
