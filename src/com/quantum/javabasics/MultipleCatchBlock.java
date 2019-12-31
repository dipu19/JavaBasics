package com.quantum.javabasics;

import java.nio.file.FileSystemNotFoundException;

//Example on multiple catch block
public class MultipleCatchBlock {
	
	public static void main(String[] args)
	{
		System.out.println("Hello");
		try
		{
			System.out.println(10/2);
			int s=10/0;
			System.out.println("Yes i did it");
		}
		catch(FileSystemNotFoundException e)
		{
			System.out.println("I didn't find file");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occoured");
		}
		catch(Exception e)
		{
			System.out.println("Nothing will happen");
		}
	}
}
