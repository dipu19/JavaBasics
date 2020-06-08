package com.quantum.javabasics;


import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[]args) throws Exception
	{
		FileReader fr = new FileReader("/home/dipu/Documents/MyFile.txt");
		try
		{
			int iterator;
			
			while((iterator = fr.read())!= -1)
			{
				System.out.print((char)iterator);
				
			}fr.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
