package com.quantum.javabasics;

public class TestMember {

	static class Inner
	{
		public void msg()
		{
			System.out.println("inner msg");
		}
	}
	public static void main (String[] args)
	{
		TestMember obj=new TestMember();
		//TestMember.Inner in=obj.new Inner();
		Inner in1=new Inner();
		in1.msg();
		System.out.println("Outer class");
	}
}
