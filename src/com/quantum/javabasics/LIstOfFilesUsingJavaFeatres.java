package com.quantum.javabasics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LIstOfFilesUsingJavaFeatres {

	public static void main(String[] args) throws IOException
	{
		Files.list(Paths.get("."))
		     .forEach(System.out::println);
	}
}
