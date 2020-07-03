package com.quantum.javabasics;

	interface inter
	{
		default void m1()
		{
			System.out.println("I am in interface");
		}
	}
	public class DefaultMethodInInterface implements inter{
		
		//Override default method of interface
		public void m1()
		{
			System.out.println("I am in child class ");
		}
		
		public static void main(String[] args)
		{
			DefaultMethodInInterface object = new DefaultMethodInInterface ();
			object.m1();
		}
	}
