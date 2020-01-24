package com.quantum.javabasics;

import java.io.File;

public class CheckingFile {
	
	public static void main(String[] arg)
	{
		File myFile=new File("NewFile1.txt");
		if(myFile.exists())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}
