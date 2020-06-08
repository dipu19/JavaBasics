package com.quantum.javabasics;

import java.io.FileWriter;


public class WriteInFile {

	public static void main(String[] args) throws Exception
	{
		String string = "Hello user i am here";
		
		FileWriter fw = new FileWriter("/home/dipu/Documents/MyFile.txt");
		
		try {
		fw.write(string);
		
		fw.close();
		System.out.println("Done..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
