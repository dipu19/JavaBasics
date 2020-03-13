package com.quantum.javabasics;

public class InnerClassExample {

	class Inner
	{
		int i=12;
		int j=15;
		public int  add()
		{
			int c=i+j;
			return c;
		}
	}
	public static void main(String[] args)
	{
		InnerClassExample object=new InnerClassExample();
		InnerClassExample.Inner object1=object.new Inner();
		System.out.println(object1.add());
	}
}
