package com.quantum.javabasics;

//we can implement the method in interface we can declare   
interface DefaultMethodInterf
{
	default void method1()
	{
		System.out.println("I am moving");
	}
}

public class DefaultMethod implements DefaultMethodInterf {

	public static void main(String[] args)
	{
	DefaultMethod object = new DefaultMethod();
	object.method1();
	}
}
