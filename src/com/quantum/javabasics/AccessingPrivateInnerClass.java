package com.quantum.javabasics;

class OuterPublicClass
{
	int x = 52;
	int y = 48;
	private class InnerClass
	{
		int y = 48;
	}
}

public class AccessingPrivateInnerClass {

	class ClassInner
	{
		String string = "My name is Dipu";
	}
	public static void main(String[] args)
	{
		OuterPublicClass outer = new OuterPublicClass();
		System.out.print("Result of outer class variable is ");
		System.out.print(outer.x + outer.y);
		
		//OuterPublicClass inner = outer.new InnerClass();
		
		//It is giving exception that outer.new InnerClass is not visible.
		
		AccessingPrivateInnerClass outerObject = new AccessingPrivateInnerClass();
		AccessingPrivateInnerClass.ClassInner innerClass = outerObject.new ClassInner();
		System.out.println();
		System.out.println(innerClass.string);
	}
}
