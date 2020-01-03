package com.quantum.javabasics;

public class ExampleOfThrow {
	//by using throw keyword we can create our own exception object and handover to the object
	public static void main(String[] args)
	{
		System.out.println("Hello Dipu");
		throw new ArithmeticException("/by zero");
		//System.out.println("How are you");un reachable code.
	}
}
