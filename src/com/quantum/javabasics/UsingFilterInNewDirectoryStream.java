package com.quantum.javabasics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

public class UsingFilterInNewDirectoryStream {

	public static void main(String[] args) throws IOException
	{
		/*
		 * Files.newDirectoryStream(Paths.get("."),path->path.toFile().isFile())
		 * .forEach(System.out::println);
		 */
		//List of file with certain extension 
		Files.newDirectoryStream(Paths.get(""),path->path.toString().endsWith(".java"))
		.forEach(System.out::println);
		//finding hidden file
		final File[] files = new File(".").listFiles(file->file.isHidden());
		for(int i=0;i<files.length;i++)
		{
			System.out.println(files[i]);
		}
		
	}
}
