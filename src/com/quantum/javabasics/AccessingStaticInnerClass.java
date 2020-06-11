package com.quantum.javabasics;

class PublicOuterClass
{
	int x = 140;
	String string = "Dipu";
	static class InnerClass
	{
		String string = " is a good boy";
	}
}
public class AccessingStaticInnerClass {

	public static void main(String[] args)
	{
		PublicOuterClass outer = new PublicOuterClass();
		System.out.println(outer.string + outer.x);
		
		PublicOuterClass.InnerClass inner = new PublicOuterClass.InnerClass();
		
		System.out.println(outer.string+inner.string);
	}
}
