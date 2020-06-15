package com.quantum.javabasics;

class Example1
{
	
}
public class ExampleOfComposition {

	private  Example1 example;
	//here both classes are strongly bounded .
	ExampleOfComposition()
	{
		example = new Example1();
	}
	
}
