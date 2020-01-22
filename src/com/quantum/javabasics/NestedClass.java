package com.quantum.javabasics;

public class NestedClass {

	static {
		System.out.println("Dipu");
	}
	static class abc{
		static {
			System.out.println("Sipu");
		}
		public static void main(String[] args)
		{
			System.out.println("Inner class");
		}
	}
	public static void main(String[] args)
	{
		
		System.out.println("Outer class");
	}
}
