





package com.quantum.javabasics;

import java.io.File;

public class FIleCreation {
	
	public static void main(String[] args)
	{
		try
		{
			File file1=new File("E:\\NewFile1.txt");
			if(file1.createNewFile())
			{
				System.out.println("file got created"+file1.getName());
			}
			else
			{
				System.out.println("Created");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is there");
		}
	}
}
