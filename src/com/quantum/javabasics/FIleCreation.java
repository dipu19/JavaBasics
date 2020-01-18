package com.quantum.javabasics;

import java.io.File;

public class FIleCreation {
	
	public static void main(String[] args)
	{
		try
		{
			File file1=new File("E:filehandelingNewFile1.txt");
			if(file1.createNewFile())
			{
				System.out.println("file got created");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is there");
		}
	}
}
