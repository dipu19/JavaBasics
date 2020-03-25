package com.quantum.javabasics;

@FunctionalInterface
interface Interf1
{
	public int show();
	
}
public class LambdaExpressionWithoutReturnKeyWord {

	public static void main(String[] args)
	{
		Interf1 inter = ()->
		{
			System.out.println("Hii");
			return 5;
		};
		System.out.println(inter.show());
	}
}
