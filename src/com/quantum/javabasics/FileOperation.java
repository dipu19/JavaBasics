package com.quantum.javabasics;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOperation {

	public static void main(String[] args) throws IOException
	{
		File fig=new File("C:\\New folder1\\File2.txt");
		FileOutputStream fs=new FileOutputStream("File2.txt");
		DataOutputStream ds=new DataOutputStream(fs);
		
		if(fig.createNewFile())
		{
			System.out.println("file is present");
		
		}
		if(fig.exists())
		{
			System.out.println("file exist ");
			System.out.println(fig.length());
			
			
		}
		else
		{
			System.out.println("file is not present");
		}
		
			
		}
	}

