package com.quantum.javabasics;

public class MethodRecursion {

	

	public void method(int no)
	{
		
		System.out.println("Hi User");
		int i= no/2;
		if(i!=1)
		{
			method(i);
		}
	}
	
	public static void main(String[] args)
	{
		
		MethodRecursion ms = new MethodRecursion();
		
		{
		ms.method(14);
		}
		
	}
}
