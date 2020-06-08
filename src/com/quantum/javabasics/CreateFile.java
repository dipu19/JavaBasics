package com.quantum.javabasics;

import java.io.File;


public class CreateFile {

	public static void main(String[] args) throws Exception
	{
		File fw = new File("/home/dipu/Documents/MyFile.txt");
		try
		{
			boolean result = fw.createNewFile();
			
			if(result)
			{
				System.out.println("File created");
			}
			else
			{
				System.out.println("File exists");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
