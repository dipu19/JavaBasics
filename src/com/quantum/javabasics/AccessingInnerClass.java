package com.quantum.javabasics;

class OuterClass
{
	int x= 10;
	class InnerClass
	{
		int y = 15;
	}
}
public class AccessingInnerClass {

	public static void main(String[] args)
	{
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.y);
		System.out.println( outer.x);
		
	}
}
