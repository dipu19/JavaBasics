package com.quantum.javabasics;

public class MethodLevelInnerClass {

	public void method()
	{
		class Inner
		{
			int i=10;
			int j=15;
			public void innerMethod()
			{
				int c= i+j;
				System.out.println(c);
			}
		    
		}
		Inner object=new Inner();
		object.innerMethod();
	}
	public static void main(String[] args)
	{
		MethodLevelInnerClass object = new MethodLevelInnerClass();
		object.method();
	}
}
