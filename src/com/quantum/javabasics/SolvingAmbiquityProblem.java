package com.quantum.javabasics;

interface LeftInterface
{
	default void m1()
	{
		System.out.println("I am in left interface");
	}
}
interface RightInterface
{
	default void m1()
	{
		System.out.println("I am in right interface");
	}
}

interface MiddleInterface
{
	default void m1()
	{
		System.out.println("I am in middle interface");
	}
}
//implementing two interface 
public class SolvingAmbiquityProblem implements LeftInterface, RightInterface, MiddleInterface{

	public void m1()
	{
		MiddleInterface.super.m1();
		System.out.println("");
		System.out.println("   problem solved");
	}
	
	public static void main(String[] args)
	{
		SolvingAmbiquityProblem object = new SolvingAmbiquityProblem();
		object.m1();
	}
	
}
