package com.quantum.javabasics;

public class MethodLevelInnerClass {

	static int k=10;
	
	public static void method()
	{
		String s="Dipu";
	     class Inner
		{
			int i=10;
			int j=15;
			public  void innerMethod()
			{
				int c= i+j;
				System.out.println(c);
				System.out.println(s);
                			
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
